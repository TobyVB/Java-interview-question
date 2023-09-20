public class Main {
    public static String findMathematicalOperation(Integer Number1, Integer Number2, Integer Number3) {
        if (Number1 + Number2 == Number3) {
            return Number1 + " + " + Number2;
        } else if (Number1 - Number2 == Number3) {
            return Number1 + " - " + Number2;
        } else if (Number1 * Number2 == Number3) {
            return Number1 + " * " + Number2;
        } else if (Number1 / Number2 == Number3 && Number1 % Number2 == 0) {
            return Number1 + " / " + Number2;
        } else {
            return "None";
        }
    }

    public static void main(String[] args) {
        Integer Number1 = 10;
        Integer Number2 = 5;
        Integer Number3 = 50;

        String result = findMathematicalOperation(Number1, Number2, Number3);
        System.out.println(result); // Output: "10 * 5"
    }
}
