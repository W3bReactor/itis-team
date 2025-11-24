import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private User from;
    private User to;
    private String text;
    private String date;

    public Message(User from, User to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
        this.date = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
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
