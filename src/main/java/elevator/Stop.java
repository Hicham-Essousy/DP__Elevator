package elevator;

public class Stop extends Etat{

    @Override
    public int calDistance() {
        return 0;
    }

    @Override
    public int calDistance(int l, int level) {
        return 0;
    }

    @Override
    public String iam() {
        return null;
    }
}
