package elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Building {
    private int nbrFloor;
    private List<ElevatorImp> elevators = new ArrayList<>();
    TreeMap<Integer, String> diff = new TreeMap<Integer, String>();

    public Building(int nbrFloor, String elevator1, String elevator2) {
        this.nbrFloor = nbrFloor;
        elevators.add(new ElevatorImp(elevator1.substring(0, 3), (int) Integer.parseInt(elevator1.substring(4, 5)), new Rest(), nbrFloor));
        elevators.add(new ElevatorImp(elevator2.substring(0, 3), (int) Integer.parseInt(elevator2.substring(4, 5)), new Rest(), nbrFloor));
    }

    public String requestElevator() {
        diff.clear();
        for (ElevatorImp E : elevators) {
            diff.put(E.getEtat().calDistance(), E.getId());

        }
        Map.Entry<Integer, String> ent = diff.firstEntry();
        return ent.getValue();
        //return null;
    }

    public String requestElevator(int l) {
        diff.clear();
        for (ElevatorImp E : elevators) {
            diff.put(E.getEtat().calDistance(l,E.getLevel()), E.getId());
            //System.out.println(E.getEtat().calDistance(l,E.getLevel())+"------"+E.getId());
        }
        System.out.println(diff);
        Map.Entry<Integer, String> ent = diff.firstEntry();
        System.out.println(ent);
        return ent.getValue();
        //return null;
    }

    public void move(String id, String etat) {

        for (ElevatorImp E : elevators) {
            if (id.equals(E.getId())) {
                if (etat.equals("Down")) {
                    E.setEtat(new Down());
                } else if (etat.equals("Up")) {
                    //System.out.println("UUUUUpppppp");
                    E.setEtat(new Up());
                }


            }

        }
    }

    public List<ElevatorImp> getElevators() {
        return elevators;
    }
//person on top
   /* public String requestElevator(){
        TreeMap<Integer,String> diff=new TreeMap<Integer,String>();
        for (int i=0;i<elevators.size();i++){
            if (elevators.get(i).getEtat().getState().equals("Up")){
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
            if (elevators.get(i).getEtat().getState().equals("Up")){
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
    }*/

    public void setElevators(List<ElevatorImp> elevators) {
        this.elevators = elevators;
    }
}
