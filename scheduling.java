package interviewScheduling;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import interviewScheduling.*;
public class scheduling{
    private int m;//Number of interviewee
    private int iv;//Number of interviewer
    private int r;//Number of rooms
    private List<room> rQ;//Q for rooms
    private List<interviewer> ivQ;//Q for iv
    private List<timeSlot> timeSlots;//List of TimeSlots
    private List<schedule> S;
    public scheduling(int m, int n, int r){
        this.m = m;
        this.iv = n;
        this.r = r;
        rQ= new LinkedList<>();
        ivQ= new LinkedList<>();
        timeSlots = new ArrayList<>();
        S = new ArrayList<>();
    }
    public void init_rQ(){//Initialising the rowQ
        for(int i=0;i<r;i++){
            room r = new room("R"+i);
            rQ.add(r);
        }
    }
    public void init_ivQ(){//Initialising the ivQ
        for(int i=0;i<iv;i++){
            interviewer iv = new interviewer("I"+i);
            ivQ.add(iv);
        }
    }
    private void init_ts(){//initialise all the timeslots
        timeSlots.add(new timeSlot(9,10));
        timeSlots.add(new timeSlot(10,11));
        timeSlots.add(new timeSlot(11,12));
        timeSlots.add(new timeSlot(12,13));
        timeSlots.add(new timeSlot(14,15));
        timeSlots.add(new timeSlot(15,16));
        timeSlots.add(new timeSlot(16,17));
    }
    public void init(){ init_rQ(); init_ivQ(); init_ts(); }//Initialise all the lists
    public void shuffleQ(){//Deleting the element at index 0 and adding it to the end of the list
        room r = rQ.get(0);
        interviewer iv = ivQ.get(0);
        //removing from first position
        rQ.remove(0);
        ivQ.remove(0);
        //adding to the last position
        rQ.add(r);
        ivQ.add(iv);
    }
    public boolean isTimeSlotRemaining(int index){
        try{
            timeSlots.get(index);
        }catch(IndexOutOfBoundsException e){ return false;}
        return true;
    }
    public void assign(){
        init();//Initialise all objects
        int assignPerTimeSlot = (iv>r)? r:iv; //Setting the lower limit as the no of assign per slot
        for(int subScheduleCount=0;m>0;subScheduleCount++){
            //Check if timeSlot is over
            if(!isTimeSlotRemaining(subScheduleCount))
                break;//break the outer loop
            //Setting the lower value among them as iteration count
            int iterationLimit = (m>assignPerTimeSlot)? assignPerTimeSlot:m;
            //Create a sub Schedule
            schedule subS = new schedule(timeSlots.get(subScheduleCount));
            //Adding the rooms and interviewers to the subschedule per time slot
            for(int i=0;i<iterationLimit;i++){
                subS.addRooms(rQ.get(0));
                subS.addInterviewer(ivQ.get(0));
                shuffleQ();
            }
            S.add(subS);
            m-=iterationLimit;
        }
    }
    public void displaySchedule(){
        for(schedule subS : S){ subS.displayAll(); }
        if(m!=0)
            System.out.println("Remaining candidates:"+m);
    }
}