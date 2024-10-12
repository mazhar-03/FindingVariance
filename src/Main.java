public class Main {
    static{
        System.loadLibrary("libuntitled");
    }
    public static void main(String[] args) {
        Main main = new Main();

        double[] values = new double[]{3.71, 3.76, 3.70, 3.69, 3.64};
        System.out.println(main.variance(values));

    }
    public native double variance(double[] dataSet);
}
