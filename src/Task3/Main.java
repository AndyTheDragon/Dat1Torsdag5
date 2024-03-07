package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room bedroom = new Room(2, 4, 2);
        Room livingroom = new Room(2, 3, 4);
        Room kitchen = new Room(1, 2, 2);
        Room hall = new Room(7, 2, 0);
        ArrayList<Room> roomsInHome = new ArrayList<>();
        roomsInHome.add(bedroom);
        roomsInHome.add(livingroom);
        roomsInHome.add(kitchen);
        roomsInHome.add(hall);
        Building home = new Building(roomsInHome, 1, 1, false);

        System.out.println(countLampsInBuilding(home));
        System.out.println(isNormal(home));

    }
    public static int countLampsInBuilding(Building b) {
        int counter = 0;
        for (Room room : b.getRooms()) {
            counter += room.getNumberOfLamps();
        }
        return counter;
    }
    public static boolean isNormal(Building b) {
        int numberOfRooms = b.getRooms().size();
        if (b.getNumberOfFloors() > numberOfRooms) {
            return true;
        }
        else {
            System.out.println("This is an odd building");
            return false;
        }

    }

}
