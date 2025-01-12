public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 85; // вес в килограммах
        double height = 1.79; // рост в метрах
        double bmi = service.calculate(weight, height);
        String bmiResult = String.format("%.2f", bmi);
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height * 100 + " см.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }
}