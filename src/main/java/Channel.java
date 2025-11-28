public class Channel {
    User user;
    User subscribers;
    Message message;

    public void printMessage(User user, Message groupMessage) {
        if (user.status.equals("CHANNEL_ADMIN")) {
            System.out.println("В канале вышел новый пост: ");
            System.out.println(groupMessage.toString());
        }
    }
}
