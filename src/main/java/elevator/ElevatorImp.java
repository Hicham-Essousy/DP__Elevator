package elevator;

public class ElevatorImp {
    private String id;
    private int level;
    private Etat etat;
    private int nbrOfFloor;


    public ElevatorImp(String id, int level, Etat etat, int nbrOfFloor) {
        this.id = id;
        this.level = level;
        this.etat = etat;
        this.etat.setLevels(level);
        this.etat.setNbrOfFloor(nbrOfFloor);
        this.nbrOfFloor = nbrOfFloor;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public int getNbrOfFloor() {
        return nbrOfFloor;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
