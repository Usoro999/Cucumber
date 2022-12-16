package UserData;

public class Users extends UserClass{
    public static UserClass userAdmin = new UserClass("Yurii","Soro","email@gmail.com",Gender.MAN,"0963552600");
    public static UserClass userUser = new UserClass("Anton","Pikov","pikov@gmail.com",Gender.OTHERS,"0963552600");
    public static UserClass userSupport = new UserClass("Jenia","Dir","dir@gmail.com",Gender.WOMAN,"0963552600");

    public Users(String firstname, String lastname, String email, Gender gender, String phoneNumber) {
        super(firstname, lastname, email, gender, phoneNumber);
    }
}
