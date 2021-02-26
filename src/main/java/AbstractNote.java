public abstract class AbstractNote {

    private String author;
    private String date;
    private String message;
    private Data MESSAGETYPE;

    AbstractNote(String author, String date, String message, Data MESSAGETYPE){
        this.author = author;
        this.date = date;
        this.message = message;
        this.MESSAGETYPE = MESSAGETYPE;
    }

    public void showContent() {
        System.out.println("Author is: " + author);
        System.out.println("Date is: " + date);
        System.out.println("Message is: " + message);
        System.out.println("Message type is: " + MESSAGETYPE);
    }

    abstract Integer maxMessageSize();

}