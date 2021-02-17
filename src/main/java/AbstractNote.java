abstract public class AbstractNote {

    private final String author;
    private final String date;
    private final String message;
    private final String messageType;

    AbstractNote(String author, String date, String message, String messageType){
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
    }

    public void showContent() {
        System.out.println("Author is: " + author);
        System.out.println("Date is: " + date);
        System.out.println("Message is: " + message);
        System.out.println("Message type is: " + messageType);
    }

    abstract Integer maxMessageSize();

}