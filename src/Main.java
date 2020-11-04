public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 50;
        float growth = 1.65F;
        float BMI = service.calculate(weight, growth);
        System.out.println(BMI);
    }
}
