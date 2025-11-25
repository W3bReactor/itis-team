public class Channel {
    User user;
    User subscribers;
    Message message;

    public void printMessage(User user, Message message) {
        if (user.status.equals("CHANNEL_ADMIN")) {
            System.out.println("В канале вышел новый пост: ");
            System.out.println(message.toString());
        }
    }
}
