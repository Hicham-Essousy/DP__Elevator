package elevator;

public abstract class Etat {
    private int levels;
    private int nbrOfFloor;

    public abstract int calDistance();
    public abstract int calDistance(int l, int level);

    public abstract String iam();
    /*public abstract void exStop();
    public abstract void exMoveDown();
    public abstract void exMoveUp();
    public abstract void exToActivity();*/

    public int getLevels() {
        return levels;
    }

    public int getNbrOfFloor() {
        return nbrOfFloor;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void setNbrOfFloor(int nbrOfFloor) {
        this.nbrOfFloor = nbrOfFloor;
    }
}
