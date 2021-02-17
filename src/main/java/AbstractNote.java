abstract public class AbstractNote {

    private Data author = Data.AUTHOR;
    private Data date = Data.DATE;
    private Data message = Data.MESSAGE;
    private Data messageType = Data.MESSAGETYPE;

    AbstractNote(Data author, Data date, Data message, Data messageType){
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