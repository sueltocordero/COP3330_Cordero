import java.util.Arrays;

public class Decrypter {
    int position1;
    int position2;
    int position3;
    int position4;
    public String decrypt(String args){
        position1 = Integer.parseInt(args)/1000%10;
        position2 = Integer.parseInt(args)/100%10;
        position3 = Integer.parseInt(args)/10%10;
        position4 = Integer.parseInt(args)%10;
        position1 = convertBackToNormal(position1);
        position2 = convertBackToNormal(position2);
        position3 = convertBackToNormal(position3);
        position4 = convertBackToNormal(position4);
        int swapped[] = swap(position1,position2,position3,position4);
        String output = Arrays.toString(swapped);
        return output;
    }
    public int convertBackToNormal(int digit){
        digit = digit + 3;
        digit = digit%10;
        return digit;
    }
    public int[] swap (int pos1, int pos2,int pos3, int pos4){
        int test = 0;
        int test2 = 0;
        test = pos1;
        pos1 = pos3;
        pos3= test;

        test2= pos2;
        pos2=pos4;
        pos4=test2;
        int arr[]= {pos1,pos2,pos3,pos4};
        return arr;
    }
}
