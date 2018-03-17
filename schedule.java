package interviewScheduling;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import interviewScheduling.*;
public class schedule{
    private timeSlot ts;
    private List<room> rooms;
    private List<interviewer> interviewers;
    public schedule(timeSlot ts){
        rooms = new ArrayList<>();
        interviewers = new ArrayList<>();
        this.ts = ts;
    } 
    public void addRooms(room r){ rooms.add(r); }
    public void addInterviewer(interviewer iv){ interviewers.add(iv); }
    public void displayAll(){
        System.out.println("-----------------------------------------");
        System.out.println("Time Slot:"+ts.toString());
        System.out.println("-----------------------------------------");
        System.out.println("Rooms:");
        System.out.println("-----------------------------------------");
        for(room r : rooms)
            System.out.print(r.toString()+"  ");
        System.out.println("\n-----------------------------------------");
        System.out.println("Interviewers:");
        System.out.println("-----------------------------------------");
        for(interviewer iv : interviewers)
            System.out.print(iv.toString()+"  ");
        System.out.println("\n-----------------------------------------");
    }
}