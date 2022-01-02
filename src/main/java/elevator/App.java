package elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {



        Building b = new Building(10,"id1:2","id2:3");
        b.move("id1","Down");
        b.move("id2","Up");
        System.out.println(b.requestElevator(7));





    }
}
