public class Video extends Media {

    private Integer numberOfViews;

    Video(String author, String date, String message, String messageType, String mediaType) {
        super(author, date, message, messageType, mediaType);
    }

    public void watchVideo() {
        this.numberOfViews++;
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.println("Number of views: " + numberOfViews);
    }
}
