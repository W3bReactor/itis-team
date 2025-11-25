public class Main {
    public static void main(String[] args) {
        System.out.println("Разработка проекта");
        Channel channel = new Channel();
        User user = new User("12345","Ilkhan","CHANNEL_ADMIN");
        User subscribers = new User("1234567","Bob","CHANNEL_USER");
        Message message = new Message(user,subscribers,"Hello world!");

        channel.printMessage(user,message);
    }
}
