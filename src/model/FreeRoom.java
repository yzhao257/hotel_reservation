package model;

public class FreeRoom extends Room{

    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, (Double) 0., enumeration);
    }

    @Override
    public String toString() {
        return "Room number: "+roomNumber+"; room type: "+enumeration+"This is a free room.";
    }
}
