import java.util.ArrayList;
import java.util.Random;

public class registor {
    ArrayList<User> registor =new ArrayList<>();

    public  void reg(String name, String pass)
    {
        User new_user= new User();
        new_user.setpassword(pass);
        new_user.setname(name);
        registor.add(new_user);
        System.out.println(name+"\n"+pass);
    }


    public  void reg(String name)
    {
        User user = new User();
        user.setname(name);
        int length = 16;
        Random r = new Random();
        String s = r.ints(48, 122)
                .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder :: new, StringBuilder :: append, StringBuilder :: append)
                .toString();
        user.setpassword(s);
        registor.add(user);
    }
    public  void del(String name, String pass){

        //Res.add(res);
        int d;
        for (d=0;d<registor.size();d++);
        if (registor.get(d).getName().equals(name)&& registor.get(d).getPassword().equals(pass));
        {registor.remove(d);}
    }
}