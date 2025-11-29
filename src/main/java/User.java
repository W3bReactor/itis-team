public class User {
    public String id;
    public String name;
    public String status;
    public String channelName;


    public User (String id, String name, String status, String channelName) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.channelName = channelName;
    }

    public User (String id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}