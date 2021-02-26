public class TextNote extends AbstractNote implements Printable {

    private boolean published;

    TextNote(String author, String date, String message, Data MESSAGETYPE, boolean published) {
        super(author, date, message, MESSAGETYPE);
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

    @Override
    public void print() {
        System.out.println("Text was printed...");
    }
}
