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


        room1.setNorth(null);
        room1.setEast(room2);
        room1.setWest(null);
        room1.setSouth(room4);

        room2.setNorth(null);
        room2.setEast(room3);
        room2.setWest(room1);
        room2.setSouth(null);

        room3.setNorth(null);
        room3.setEast(null);
        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setEast(null);
        room4.setWest(null);
        room4.setSouth(room7);

        room5.setNorth(null);
        room5.setEast(null);
        room5.setWest(null);
        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setEast(null);
        room6.setWest(null);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);
        room7.setWest(null);
        room7.setSouth(null);

        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);
        room8.setSouth(null);

        room9.setNorth(room6);
        room9.setWest(room8);
        room9.setEast(null);
        room9.setSouth(null);

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
    public boolean goWest(){
        if(currentRoom.getWest() == null){
            return false;
        }else {
            currentRoom = currentRoom.getWest();
            return true;
        }
    }


}
