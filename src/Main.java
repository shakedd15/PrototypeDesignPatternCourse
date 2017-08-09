import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ARMID060817M on 8/9/2017.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner reader = new Scanner(System.in);
        System.out.println("please insert the path: ");
        String path= reader.nextLine();
        List<String> s= Reader.readFile(path);
        UserInfo userInfo1 = new UserInfo(s);
        UserInfo userInfo12 = userInfo1.clone();

        for(int i =0; i<userInfo1.getName().size(); i++){
            System.out.println("\n  row numer " + i+ ": \n" + userInfo1.getName().get(i)+", "+userInfo1.getHigh().get(i) + ", "+userInfo1.getSex().get(i)+ ", "+userInfo1.getCountry().get(i));
            if(userInfo1.getName().get(i).length()<=2){
                String string = getNewName(i, "Name");
                userInfo12.changeNameList(i, string);
            }
            if(userInfo1.getHigh().get(i).length()<=2){
                String string = getNewName(i, "High");
                userInfo12.changeHighList(i, string);
            }
            if(userInfo1.getSex().get(i).length()<=2){
                String string = getNewName(i, "Sex");
                userInfo12.changeSexList(i, string);
            }
            if(userInfo1.getCountry().get(i).length()<=2){
                String string = getNewName(i, "Country");
                userInfo12.changeCountryList(i, string);
            }
        }
//
//        System.out.println("would you like to change somthing else?: y/n ");
//        String command= reader.next();


        System.out.println("userInfo1 arraylist: " + Arrays.toString(userInfo1.getList().toArray()));
        System.out.println("userInfo12 arraylist: " + Arrays.toString(userInfo12.getList().toArray()));
    }

    public static  String getNewName(int i, String name){
        String string = "";
        Scanner reader = new Scanner(System.in);
        System.out.println("would you like to change the " + name + " ? y/n  ");
        String command= reader.next();
        if(command.equals("y")){
            System.out.println("write the new name  ");
            string= reader.next();
        }
        return string;
    }
}
