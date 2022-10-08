import java.util.Arrays;

public class VideoPlayer extends Player{
    @Override
    void showTypeOfPlayer() {
        System.out.println("you are connected to video player!");
    }

    @Override
    public void playRecord(String record) {
        boolean found=false;
        for (int i = 0; i < content.length; i++) {
            if (record.equals(content[i])) {
                found = true;
                System.out.println(record + " is playing");
                break;
            }
        }
        if(!found) System.out.println("no such track as "+record);
    }



    @Override
    public void searchRecord(String record) {
        boolean found=false;
        for (int i = 0; i < content.length; i++) {
            if (record.equals(content[i])) {
                found = true;
                System.out.println(record + " is found");
                break;
            }
        }
        if(!found) System.out.println("no such track as "+record);
   }

    @Override
    public void stopRecord(String record1) {
        boolean found=false;
        for (int i = 0; i < content.length; i++) {
            if (record1.equals(content[i])) {
                found = true;
                System.out.println(record1 + " is stopped");
                break;
            }
        }
        if(!found) System.out.println("no such track as "+record1);
    }
}
