public class Adventure {

    private Room currentRoom;

    public Adventure() {

        Room room1 = new Room("Cabin", "Something startle");
        Room room2 = new Room("forest", "It has become dark. The thin air feels like a knife cutting through your skin." +
                "You have been walking around for hours but it is like the darkness has swallowed you. ");
        Room room3 = new Room("room3", "eeeeg");
        Room room4 = new Room("room4", "uuggg");
        Room room5 = new Room("room5", "ghhhgg");
        Room room6 = new Room("room6", "ggg");
        Room room7 = new Room("room7", "jjj");
        Room room8 = new Room("room8", "fff");
        Room room9 = new Room("room9", "kkk");

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

    public boolean goEast() {
        if (currentRoom.getEast() == null){
            return false;
        }else {
            currentRoom = currentRoom.getEast();
            return true;
        }
    }


}
