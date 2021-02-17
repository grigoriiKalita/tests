public class Media extends AbstractNote implements Runnable {

    private final String mediaType;

    Media(Data author, Data date, Data message, Data messageType, String mediaType) {
        super(author, date, message, messageType);
        this.mediaType = mediaType;
    }

    public void makeBoop(){
        System.out.println("Boop");
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.println("Media type: " + mediaType);
    }

    @Override
    Integer maxMessageSize() {
        return null;
    }

    @Override
    public void runStuff() {
        System.out.println("Running this media...");
    }
}
