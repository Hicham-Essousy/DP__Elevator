public class Elevator {
    private String id;
    private String state;
    private int level;

    public Elevator(String id, String state, int level) {
        this.id = id;
        this.state = state;
        this.level = level;
    }


    public String getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public int getLevel() {
        return level;
    }
}
