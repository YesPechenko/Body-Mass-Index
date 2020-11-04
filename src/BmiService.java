public class BmiService {
    public int calculate (float weight, float growth ) {

       float BMI = weight / (growth * growth);

        return (int) BMI;

    }

}

