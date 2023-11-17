public class BmiService {
    double result;
    public int calculate(double weight, double height){
        result = weight / (height * height);
        return (int) result;
    }
}
