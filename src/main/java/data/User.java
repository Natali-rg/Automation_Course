package data;

public class User {
    private String name, email;
    private int tel;

    public User() {
    }

    public User(String name, String email, int tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }
    public static Builder builder(){
        return new User().new Builder();
    }

    class Builder{
        public String name, email;
        public int tel;

        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setEmail(String email){
            this.email=email;
            return this;
        }
        public Builder setTelephone(int tel){
            this.tel=tel;
            return this;
        }
        public User build(){
            return new User(name,email,tel);
        }

    }
}
