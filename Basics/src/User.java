public class User {
        private String name;
        private String password;

    public String getName () {
        return this.name;
    }
        public String getPassword () {
        return this.password;
    }
        public void setname (String set_name){
        this.name = set_name;
    }
        public void setpassword (String set_password){
        this.password = set_password;
    }

    public String toString() {
        return "Name=" + name + '\'' +
                " password='" + password + '\'';
    }
}
