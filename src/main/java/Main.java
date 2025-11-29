public class Main {
    public static void main(String[] args) {

        System.out.println("Разработка проекта");


        User[] users = new User[5];
        users[0] = new User("1234567","Bob","SUBSCRIBER", "Channel1");
        users[1] = new User("1000","Ilkhan","CHANNEL_ADMIN", "Channel1");
        users[2] = new User("1001", "Malik");
        users[3] = new User("1002", "Rinat");
        users[4] = new User("1003", "Insaf");

        Channel channel1 = new Channel("Канал1");
        Message channelMessage = new Message(users[1],channel1,"Привет подписчики!");
        channel1.printMessage(users[1],channelMessage);


        Group group1 = new Group("Группа1");
        group1.addMembers(users[1]);
        group1.addMembers(users[2]);
        group1.addMembers(users[3]);




        Message[] groupMessages = new Message[2];
        groupMessages[0] = new Message(users[1], group1, "Малик, привет");
        groupMessages[1] = new Message(users[2], group1, "Привет");

        for (int i = 0; i < groupMessages.length; i++) {
            System.out.println(groupMessages[i].showGroupMessages());
        }

    }
}