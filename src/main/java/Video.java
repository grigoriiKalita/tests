public class Video extends Media implements Runnable {

    private Integer numberOfViews;

    Video(String author, String date, String message, Data MESSAGETYPE, String mediaType, Integer numberOfViews) {
        super(author, date, message, MESSAGETYPE, mediaType);
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

    @Override
    public void runStuff() {
        System.out.println("I'm ALIVE");
    }
}
