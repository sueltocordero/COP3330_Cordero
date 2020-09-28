import static jdk.nashorn.internal.objects.NativeMath.round;

public class BodyMassIndex {
    private double BMI;
    private String BMICategory;
    public BodyMassIndex(double height, double weight) {
        this.BMI = calcBMI(height, weight);

        this.BMICategory = bmiCategory(this.BMI);
    }

    public static double calcBMI(double height, double weight){
        double BMI = 703 * weight / (height * height);
        BMI = BMI*10;
        BMI = Math.round(BMI);
        BMI = BMI/10;
        return BMI;
    }

    public static String bmiCategory(double BMI){
        if(BMI<18.5){
            String under = "Underweight";
            return under;
        }if(BMI>18.5 && BMI<24.9){
            String norm = "Normal";
            return norm;
        }if(BMI>25 && BMI<29.9){
            String over = "Overweight";
            return over;
        }else{
            String obese = "Obese";
            return obese;
        }
    }
    public double returnBMI(){
        return this.BMI;
    }
    public String returnCategory(){
        return this.BMICategory;
    }
}
