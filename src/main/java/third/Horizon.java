package third;

public class Horizon {
    private Color color;
    private boolean firedUp;

    public Horizon(boolean firedUp) {
        color = firedUp ? Color.WHITE : Color.BLACK;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFiredUp() {
        return firedUp;
    }

    public void fireUp() {
        firedUp = true;
        color = Color.WHITE;
        System.out.println("сжигающие белым пламенем черный край горизонта.");
    }

    public void putFireOut() {
        firedUp = false;
        color = Color.BLACK;
    }
}
