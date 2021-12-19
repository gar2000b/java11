public class Variables {
    public static void main(String[] args) {
        int myFirstNumber = 5;
        int mySecondNumber = 6;
        int myThirdNumber = 12;
        System.out.println(myFirstNumber + mySecondNumber + myThirdNumber);

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        System.out.println("maxValue: " + maxValue);
        System.out.println("minValue: " + minValue);

        int maxByteValue = Byte.MAX_VALUE;
        int minByteValue = Byte.MIN_VALUE;

        System.out.println("\nmaxByteValue: " + maxByteValue);
        System.out.println("minByteValue: " + minByteValue);

        double numberWithUnderscore = 123_234.23;
        System.out.println("\nnumberWithUnderscore: " + numberWithUnderscore);
    }
}
