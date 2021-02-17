public class TextNote extends AbstractNote{

    private boolean published;

    TextNote(String author, String date, String message, String messageType, boolean published) {
        super(author, date, message, messageType);
        this.published = published;
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.println("Is publishe: " + published);
    }

    public void publishNote() {
        if (published) {
            System.out.println("Message was already published");
        }
        this.published = true;
    }

    @Override
    Integer maxMessageSize() {
        return null;
    }
}
