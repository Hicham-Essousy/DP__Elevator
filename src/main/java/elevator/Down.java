package elevator;

public class Down extends Etat{


    @Override
    public int calDistance() {
        return super.getLevels()+super.getNbrOfFloor();
    }

    @Override
    public int calDistance(int l, int level) {

        if (l <= super.getLevels()){
            return level -l;
        }
        else{
            return level+l;
        }

    }

    @Override
    public String iam() {
        return "DOWN";
    }

}
