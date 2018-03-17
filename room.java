package interviewScheduling;
public class room{
    private String roomName;
    private int usedCount;
    public room(String name){
        roomName = name;
        usedCount = 0;
    }
    public void increaseCount(){ usedCount++; }
    public int getCount(){ return usedCount; }
    public String toString(){ return roomName; }
}