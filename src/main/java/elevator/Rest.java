package elevator;

public class Rest extends Etat{
    @Override
    public int calDistance() {
        return Math.abs(super.getNbrOfFloor()-super.getLevels());
    }

    @Override
    public int calDistance(int l, int level) {
        return Math.abs(l-level);
    }

    @Override
    public String iam() {
        return "REST";
    }
}
