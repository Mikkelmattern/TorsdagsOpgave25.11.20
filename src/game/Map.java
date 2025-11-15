package game;

public class Map {

    private Room startRoom;

    public void buildMap() {
        //create room
        Room room1 = new Room("Outside", "forrest outside a cave - the cave-entrance splits in two different directions.");
        room1.addItem("an old rusty flashlight");
        room1.addItem("a crinkly paper map with a big X in the middle", "map");
        Room room2 = new Room("Narrow cave", "narrow cave that seems to bend up and down almost infinitely");
        Room room3 = new Room("Large grotto", "large grotto with an opening very far above where sunlight shines through.");
        room3.addItem("a wicker bird cage");
        Room room4 = new Room("Wet cave", "large dark cave - the floor is quite wet and slippery here.");
        Room room5 = new Room("Room 5 (Placeholder)", "Desc room 5 (Placeholder)");
        Room room6 = new Room("Room 6 (Placeholder)", "Desc room 6 (Placeholder)");
        Room room7 = new Room("Room 7 (Placeholder)", "Desc room 7 (Placeholder)");
        Room room8 = new Room("Room 8 (Placeholder)", "Desc room 8 (Placeholder)");
        Room room9 = new Room("Room 9 (Placeholder)", "Desc room 9 (Placeholder)");

        // Connect rooms
        // Room 1
        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);
        // Room 2
        room2.setWestRoom(room1);
        room2.setEastRoom(room3);
        // Room 3
        room3.setSouthRoom(room6);
        room3.setWestRoom(room2);
        // Room 4
        room4.setNorthRoom(room1);
        room4.setSouthRoom(room7);
        // Room 5
        room5.setSouthRoom(room8);
        // Room 6
        room6.setSouthRoom(room3);
        room6.setSouthRoom(room9);
        // Room 7
        room7.setNorthRoom(room4);
        room7.setEastRoom(room8);
        // Room 8
        room8.setNorthRoom(room5);
        room8.setWestRoom(room7);
        room8.setEastRoom(room9);
        // Room 9
        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);

        startRoom = room1;
    }

    public Room getStartRoom() {
        return startRoom;
    }
}
