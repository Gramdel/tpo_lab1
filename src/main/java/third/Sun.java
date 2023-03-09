package third;

public class Sun {
    private int brightness;
    private Color color;
    private Shape shape;

    public Sun(int brightness, Shape shape) {
        this.brightness = brightness;
        this.shape = shape;
        switch (shape) {
            case DOT:
                color = Color.RED;
                break;
            case NARROW_HALF_MOON:
                color = Color.YELLOW;
                break;
            case FULL_CIRCLE:
                color = Color.WHITE;
                break;
        }
    }

    public void shine() {
        brightness = Integer.MAX_VALUE;
        System.out.println("В полной темноте сверкнула ослепительно яркая точка света.");
    }

    public void transform(Shape shape, Horizon horizon) {
        this.shape = shape;
        switch (shape) {
            case DOT:
                color = Color.RED;
                horizon.putFireOut();
                break;
            case NARROW_HALF_MOON:
                color = Color.YELLOW;
                System.out.println("Она начала расползаться в стороны, превращаясь в узкий полумесяц, ");
                horizon.putFireOut();
                break;
            case FULL_CIRCLE:
                color = Color.WHITE;
                System.out.println("и через несколько секунд показались два солнца: огненные светила, ");
                horizon.fireUp();
                break;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public Color getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }
}
