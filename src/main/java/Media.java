public class Media extends AbstractNote {

    private final String mediaType;

    Media(String author, String date, String message, String messageType, String mediaType) {
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
}
