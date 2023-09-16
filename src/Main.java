public class Main {
    public static void main(String[] args) {
        double[] test = {2.55, 3.55, 5.55, -13.12, 6.66, -9.99, -8.88, 13.33, 10.1, 70.13, -45.54, -155.54, -2.3, 6.6, -54.45};
        double headshot = 0;
        int terrorist = 0;
        boolean firstNegative = false;
        for (double EMBE : test) {
            if (EMBE < 0) {
                firstNegative = true;
            } else if (firstNegative) {
                headshot += EMBE;
                terrorist++;
            }
        }
        double big = headshot / terrorist;
        System.out.println("Среднее арифметическое положительных чисел - " + big);
    }
}