public class Main {
    public static void main(String[] args) {

        System.out.println("Разработка проекта");
        Channel channel = new Channel();


        User[] users = new User[5];
        users[0] = new User("1234567","Bob","SUBSCRIBER");
        users[1] = new User("1000","Ilkhan","CHANNEL_ADMIN");
        users[2] = new User("1001", "Malik");
        users[3] = new User("1002", "Rinat");
        users[4] = new User("1003", "Insaf");

        Message Message1 = new Message(users[1],users[0],"Hello subs!");


        channel.printMessage(users[1],Message1);
    }
}
