public class Audio extends Media {

    private boolean kachaet;

    Audio(String author, String date, String message, String messageType, String mediaType, boolean kachaet) {
        super(author, date, message, messageType, mediaType);
        this.kachaet = kachaet;
    }

    public void addBase() {
        this.kachaet = true;
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.println("Kachaet? : " + kachaet);
    }
}
