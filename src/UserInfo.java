import java.util.ArrayList;
import java.util.List;

/**
 * Created by ARMID060817M on 8/9/2017.
 */
public class UserInfo {

    List<String> name = new ArrayList<String>();
    List<String> high = new ArrayList<String>();
    List<String> sex = new ArrayList<String>();
    List<String> country = new ArrayList<String>();

    public UserInfo(List<String> allUserInfo){
        allUserInfo.forEach(user->{
            String[] s= user.split(",");
            name.add(s[0]);
            high.add(s[1]);
            sex.add(s[2]);
            country.add(s[3]);
        });
    }

    public List getList(){
        List<String> userCopyList = new ArrayList<>();
        for(int i =0; i<name.size(); i++){
            userCopyList.add(name.get(i)+", "+high.get(i) + ", "+sex.get(i)+ ", "+country.get(i));
        }
        return userCopyList;
    }

    public void changeNameList(int index, String newName){
        this.name.add(index, newName);
    }

    public void changeSexList(int index, String newName){
        this.high.add(index, newName);
    }

    public void changeHighList(int index, String newName){
        this.sex.add(index, newName);

    }

    public void changeCountryList(int index, String newName){
        this.country.add(index, newName);
    }


    protected UserInfo clone() throws CloneNotSupportedException {
        List<String> userCopyList = new ArrayList<>();
        for(int i =0; i<name.size(); i++){
            userCopyList.add(name.get(i)+", "+high.get(i) + ", "+sex.get(i)+ ", "+country.get(i));
        }
        return new UserInfo(userCopyList);
    }

    public List<String> getName() {
        return name;
    }

    public List<String> getHigh() {
        return high;
    }

    public List<String> getSex() {
        return sex;
    }

    public List<String> getCountry() {
        return country;
    }
}
