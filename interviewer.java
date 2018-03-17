package interviewScheduling;
public class interviewer{
    private String ivName;
    private int usedCount;
    public interviewer(String name){
        ivName = name;
        usedCount = 0;
    }
    public void increaseCount(){ usedCount++; }
    public int getCount(){ return usedCount; }
    public String toString(){ return ivName; }
}