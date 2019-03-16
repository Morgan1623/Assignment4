package Assignment4.Encapsulation;

public class UserInfo
{
    private String name;
    private String email;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public static void main(String[] args) {

        UserInfo info = new UserInfo();

        info.setName("AbiAndroid");
        info.setEmail("info@abhiandroid.com");

        System.out.println("Name: "+info.getName());
        System.out.println("Email: "+info.getEmail());

    }

}//closes class
