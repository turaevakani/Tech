import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String[] content={"High by the beach","Black beauty","Pink venom","Shutdown"};
        Scanner sc=new Scanner(System.in);
        VideoPlayer v=new VideoPlayer();
        v.showTypeOfPlayer();
        v.searchRecord("Black beauty");
        v.searchRecord("kf");
        System.out.println("-------------------------------");
        System.out.println("your tracks: "+ Arrays.toString(content));
        System.out.println("please choose to play a record");
        String record= sc.nextLine();
        v.playRecord(record);
        System.out.println("------------------------------");
        String record1=sc.nextLine();
        v.stopRecord(record1);


    }
}
