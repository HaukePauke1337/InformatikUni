public class FlapBridge {

    private int length;
    private boolean isopen;

    public FlapBridge(int nlength) {
        length = nlength;
        isopen = false;

    }
    public void open() {
        isopen = true; 

    }
    public void close() {
        isopen = false;
    }
    public void println() {
        SimpleIO.print("[FlapBridge: ");
        SimpleIO.print("length=" + length);
        SimpleIO.println(", isopen=" + isopen+ "]");

    }
}