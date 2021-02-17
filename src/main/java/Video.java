public class Video extends Media implements Runnable {

    private Integer numberOfViews;

    Video(Data author, Data date, Data message, Data messageType, String mediaType, Integer numberOfViews) {
        super(author, date, message, messageType, mediaType);
        this.numberOfViews = numberOfViews;
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
