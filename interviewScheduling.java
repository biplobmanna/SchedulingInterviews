package interviewScheduling;

import java.io.*;
import interviewScheduling.*;
public class interviewScheduling{

     public static void main(String []args){
        System.out.println("Hello World");
        int m = 11;//Numbe of Interviewee
        int n = 2;//Number of Interviewer
        int r = 3;//Number of Rooms
        scheduling S = new scheduling(m, n, r);
        S.assign();
        S.displaySchedule();
     }
}



