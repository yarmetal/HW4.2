public class BmiService {
    public int calculate(int weight, double height) {
        int bmi = (int) (weight / (height * height));
        return bmi;
    }
}