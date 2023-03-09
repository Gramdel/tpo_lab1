package third;

public class GoodMorning {
    private final Sun sun;
    private final Horizon horizon;

    public GoodMorning(Sun sun, Horizon horizon) {
        this.sun = sun;
        this.horizon = horizon;
    }

    public boolean start() {
        try {
            sun.shine();
            Thread.sleep(1000);
            sun.transform(Shape.NARROW_HALF_MOON, horizon);
            Thread.sleep(2000);
            sun.transform(Shape.FULL_CIRCLE, horizon);
            System.out.println("Яркие цветные сполохи струились сквозь разреженную атмосферу.");
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
