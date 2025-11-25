public class User {
    public String id;
    public String name;
    public String status;

    public User (String id, String name,String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
