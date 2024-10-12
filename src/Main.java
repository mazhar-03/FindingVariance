public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        double[] values = new double[]{3.71, 3.76, 3.70, 3.69, 3.64};
        System.out.println(main.variance(values));

    }
    public double variance(double[] dataSet){
        double sumOfArray = 0;
        for(double val : dataSet)
            sumOfArray += val;

        // we gon subtract the mean value from every element of the given data set.
        // Then taking the power of that values and sum everyone then we divide it by length-1
        double meanVal = sumOfArray / dataSet.length;

        double sumOfPoweredNumbers = 0;
        for(double val : dataSet){
            sumOfPoweredNumbers += Math.pow((val - meanVal), 2);
        }

        return sumOfPoweredNumbers / (dataSet.length - 1);
    }
}
