import java.util.Date;

public class Message {
    private User from;
    private User to;
    private String text;
    private Date date;

    public Message(User from, User to, String text, Date date) {
        this.from = from;
        this.to = to;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from=" + from +
                ", to=" + to +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
