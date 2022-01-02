import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Building {
    private int nbrFloor;
    private String elevator1;
    private String elevator2;
    private List<Elevator> elevators;

    public Building(int nbrFloor, String elevator1, String elevator2) {
        this.nbrFloor = nbrFloor;
        this.elevator1 = elevator1;
        this.elevator2 = elevator2;
    }
    //person on top
    public String requestElevator(){
        TreeMap<Integer,String> diff=new TreeMap<Integer,String>();
        for (int i=0;i<elevators.size();i++){
            if (elevators.get(i).getState().equals("Up")){
                diff.put(this.nbrFloor-elevators.get(i).getLevel(),elevators.get(i).getId());
            }
            else{
                diff.put(elevators.get(i).getLevel()+10,elevators.get(i).getId());
            }
        }
        Map.Entry<Integer, String> ent = diff.firstEntry();
        return ent.getValue();
    }

    public String requestElevator(int lev){
        TreeMap<Integer,String> diff=new TreeMap<Integer,String>();
        for (int i=0;i<elevators.size();i++){
            if (elevators.get(i).getState().equals("Up")){
                if(lev >= elevators.get(i).getLevel())
                    diff.put(lev-elevators.get(i).getLevel(),elevators.get(i).getId());
                else
                    diff.put((this.nbrFloor-elevators.get(i).getLevel())+(this.nbrFloor-lev),elevators.get(i).getId());
            }
            else{
                if(lev >= elevators.get(i).getLevel())
                    diff.put(elevators.get(i).getLevel()+lev,elevators.get(i).getId());
                else
                    diff.put( elevators.get(i).getLevel()-lev,elevators.get(i).getId());
            }
        }
        Map.Entry<Integer, String> ent = diff.firstEntry();
        return ent.getValue();
    }

    public void setNbrFloor(int nbrFloor) {
        this.nbrFloor = nbrFloor;
    }

    public void setElevator1(String elevator1) {
        this.elevator1 = elevator1;
    }

    public void setElevator2(String elevator2) {
        this.elevator2 = elevator2;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }
}
