package elevator;

public class Up extends Etat {


    @Override
    public int calDistance() {
        return super.getNbrOfFloor()-super.getLevels();
    }

    @Override
    public int calDistance(int l , int level) {
        int diff;
        if (l>=level)
            diff=l-level;
        else
            diff=(super.getNbrOfFloor()-level)+(level-l);
        return diff;
    }

    @Override
    public String iam() {
        return "UP";
    }


}

