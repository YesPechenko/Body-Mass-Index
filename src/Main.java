public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float BMI = service.calculate(50, 1.65F);
        System.out.println(BMI);
    }
}
