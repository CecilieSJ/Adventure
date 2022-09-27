public class Adventure {

    private Room currentRoom;

    public Adventure() {

        Room room1 = new Room("Cabin", "Something startle");
        Room room2 = new Room("forest", "It has become dark. The thin air feels like a knife cutting through your skin." +
                "You have been walking around for hours but it is like the darkness has swallowed you. ");
        Room gateToVillage = new Room("Gate to village", "You keep moving forward though the dark forest " +
                "and after what feels like forever you finally arrive to a clearing. " +
                "Where their is a gate but if you look closer to it, you can see that the gate has a lock on it, which requires a key");
        Room room4 = new Room("room4", "uuggg");
        Room room5 = new Room("room5", "ghhhgg");
        Room theVillage = new Room("The village", "You open the gate, walks in. But the moment you do so," +
                "the gate closes shut behind you and you are now unable to go back to your cabin from that way" +
                "As the key only works one way and you would have to find another way pass the gate." +
                " You look away from the gate and you can see what seems to be an abandoned village, however you have a feel that it might not be the case");
        Room room7 = new Room("room7", "jjj");
        Room room8 = new Room("room8", "fff");
        Room theHouse = new Room("The House", "You walk over to one of the houses, which to your surprise is'nt locked"+
                "you enter the house and you discover that the house only has one big room, which looks old and abandoned" +
                "the only sign of anyone that used to live there," +
                "is an old bed and some shelves with some books and some stuff on a bedside table"+
                "Where you find a note that states 'go to the lake and you will find what you seek'" + "You then exit the house and you can see a lake to the west from you"+
                "and the way that you came from.");


        room1.setNorth(null);
        room1.setEast(room2);
        room1.setWest(null);
        room1.setSouth(room4);

        room2.setNorth(null);
        room2.setEast(gateToVillage);
        room2.setWest(room1);
        room2.setSouth(null);

        gateToVillage.setNorth(null);
        gateToVillage.setEast(null);
        gateToVillage.setWest(room2);
        gateToVillage.setSouth(theVillage);

        room4.setNorth(room1);
        room4.setEast(null);
        room4.setWest(null);
        room4.setSouth(room7);

        room5.setNorth(null);
        room5.setEast(null);
        room5.setWest(null);
        room5.setSouth(room8);

        theVillage.setNorth(gateToVillage);
        theVillage.setEast(null);
        theVillage.setWest(null);
        theVillage.setSouth(theHouse);

        room7.setNorth(room4);
        room7.setEast(room8);
        room7.setWest(null);
        room7.setSouth(null);

        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(theHouse);
        room8.setSouth(null);

        theHouse.setNorth(theVillage);
        theHouse.setWest(room8);
        theHouse.setEast(null);
        theHouse.setSouth(null);

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
