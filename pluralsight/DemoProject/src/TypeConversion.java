public class TypeConversion {

    public static void main(String[] args){
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) byteVal;

        //short result = byteVal-longVal;
        short result2 = (short)(byteVal-longVal);

        double result3 = longVal -doubleVal;

        long result4 = (long)(shortVal - longVal + floatVal + doubleVal);

        System.out.println(floatVal);
        System.out.println(doubleVal);
        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(longVal);

        System.out.println();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println("Success");
    }

}