public class Image extends Media implements Printable {

    private String pathToImage;

    Image(Data author, Data date, Data message, Data messageType, String mediaType, String pathToImage) {
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

    @Override
    public void print() {
        System.out.println("Image was printed...");
    }
}
