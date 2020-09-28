import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static boolean moreInput() {
        System.out.println("Would you like to calculate your BMI?\n(Type Y or N)");
        Scanner in = new Scanner(System.in);
        while (true){
            String choice = in.nextLine();
            if(choice.charAt(0)=='y' ||choice.charAt(0)=='Y'){

                return true;
            }if(choice.charAt(0)=='n' ||choice.charAt(0)=='N'){

                return false;
            }if(choice.charAt(0)!='y' || choice.charAt(0)!='Y' ||choice.charAt(0)!='n' ||choice.charAt(0)!='N'){
                System.out.println("Invalid input, do it again");

            }

        }
    }
    public static double getUserHeight() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide height in inches");
        double height = in.nextDouble();
        height = Math.abs(height);
        return height;
    }
    public static double getUserWeight() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide weight in pounds");
        double weight = in.nextDouble();
        weight = Math.abs(weight);
        return weight;
    }

    public static void displayBmiInfo(BodyMassIndex bmi){
        System.out.println("The BMI is " + bmi.returnBMI() + " and falls in "+ bmi.returnCategory() + " category");
    }

    public static void displayBmiStatistics(ArrayList bmiData){
        double total = 0;
        double loops = 0;
        for( int i =0 ; i < bmiData.size() ; i++){
        BodyMassIndex tmp = (BodyMassIndex) bmiData.get(i);
        double temp = tmp.returnBMI();
        total= total + temp;
        loops++;
        }
        double avgBMI = total/loops;
        System.out.println("The average BMI is " + avgBMI);
    }


    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);

        }

}

