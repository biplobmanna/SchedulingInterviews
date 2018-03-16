public class interviewSceduling{

     public static void main(String []args){
        System.out.println("Hello World");
        int m = 20;//Numbe of Interviewee
        int n = 5;//Number of Interviewer
        int r = 6;//Number of Rooms
     }
}
public class timeSlot{
   private String ts;
   public timeSlot(int beginTime,int endTime){ ts=beginTime+"-"+endTime; }
   public timeSlot(String slot){ ts=slot; }
   public String toString(){
       return ts;
   }
}
public class room{
    private String roomName;
    public String getRoomName(){ return roomName; }
    public void setRoomName(String name){ roomName=name; }
}
public class interviewer{
    private String ivName;
    public String getIvName(){ return ivName; }
    public void setIvName(String name){ ivName=name; }
}
public class schedule{
    private timeSlot ts;
    private room[] r;
    private int rIndex;
    private interviewer[] iv;
    private int ivIndex;
    public schedule(String slot,int rCount,int ivCount){
        ts=new timeSlot(slot);
        r=new room[rCount];
        iv=new interviewer[ivCount];
        rIndex=0;
        ivIndex=0;
    }
    public void assign(String rName,String ivName){
        r[rIndex++].setRoomName(rName);
        iv[ivIndex++].setIvName(ivName);
    }
    public void displaySchedule(){
        System.out.println("-----------------------");
        System.out.println(ts.toString());
        System.out.println("-----------------------");
        System.out.println("Room\t:\tInterviewer");
        for(int i=0;i<rIndex;i++)
            System.out.println(r[i].getRoomName()+"\t:\t"+iv[i].getIvName());
    }
}
public class scheduling{
    private int m;//Number of interviewee
    private int iv;//Number of interviewer
    private int r;//Number of rooms
    private int rQ1[];//Q1 for rooms
    private int rQ1Index;
    private int rQ2[];//Q2 for rooms
    private int rQ2Index;
    private int ivQ1[];//Q1 for interviewers
    private int ivQ1Index;
    private int ivQ2[];//Q2 for interviewers
    private int ivQ2Index;
    public scheduling(int m, int n, int r){
        this.m = m;
        this.iv = n;
        this.r = r;
        rQ1=new int[r];
        rQ2=new int[r];
        ivQ1=new int[n];
        ivQ2=new int[n];
        rQ1Index=rQ2Index=ivQ1Index=ivQ2Index=0;
    }
    public void init_rQ(){//Initialising the rowQ
        for(int i=0;i<r;i++){
            rQ1[i]=i;//Row name(index is the name)
            rQ2[i]=-1;//Empty = -1
        }
    }
    public void init_ivQ(){//Initialising the ivQ
        for(int i=0;i<iv;i++){
            ivQ1[i]=i;//iv name(index is the name)
            ivQ2[i]=-1;//Empty = -1
        }
    }
    public void initQ(){ init_rQ(); init_ivQ(); }
    public void 
}
