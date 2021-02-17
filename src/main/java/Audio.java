public class Audio extends Media implements Runnable {

    private boolean kachaet;

    Audio(Data author, Data date, Data message, Data messageType, String mediaType, boolean kachaet) {
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

    @Override
    public void runStuff() {
        System.out.println("Run dat track");
    }
}
