public class Adventure {

    private Room currentRoom;

    public Adventure() {

        Room room1 = new Room("room1", "hehd");
        Room room2 = new Room("room2", "ggg");
        Room room3 = new Room("room3", "eeeeg");
        Room room4 = new Room("room4", "uuggg");
        Room room5 = new Room("room5", "ghhhgg");

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room4.setNorth(room1);

        currentRoom = room1;
    }

    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getNorth();
            return true;
        }

    }

    public boolean goSouth() {
        if (currentRoom.getSouth() == null) {
            return false;
        } else {
            currentRoom = currentRoom.getSouth();
            return true;
        }
    }


}
