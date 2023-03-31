public class dz6 {
    public static void main(String[] args) {
        int a = 40;
        int b = 30;
        int c = 20;
        int d = 10;
        int result1 = a + b;
        int result2 = c + d;

        ++result1;
        --result2;
        --result2;
        System.out.println(result1 > result2);

        String totalDecision = result1 % 2 == 0 || result2 % 2 == 0 ? "true" : "false";

        System.out.println(totalDecision);

    }


}


