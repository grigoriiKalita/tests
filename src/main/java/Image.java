public class Image extends Media {

    private String pathToImage;

    Image(String author, String date, String message, String messageType, String mediaType, String pathToImage) {
        super(author, date, message, messageType, mediaType);
        this.pathToImage = pathToImage;
    }

    public void changeImagePath(String newPath) {
        this.pathToImage = newPath;
    }

    @Override
    public void showContent() {
        super.showContent();
        System.out.println("Image path: " + pathToImage);
    }
}
