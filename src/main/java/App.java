import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Elevator a = new Elevator("id:1","Up",7);
        Elevator b = new Elevator("id:2","Up",8);
        List<Elevator> elevatorList = new ArrayList<Elevator>();
        elevatorList.add(a);
        elevatorList.add(b);

        Building h = new Building(10,a.getId(),b.getId());
        h.setElevators(elevatorList);

        System.out.println(h.requestElevator(5));

    }
}
