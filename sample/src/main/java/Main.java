import calculator.*;

public class Main {

    public static void main(String[] args) {
        int result1 = Add.run(1, 3);
        int result2 = Substract.run(7, 4);
        int result3 = Multiple.run(5, 4);
        float result4 = Divide.run(10, 2);
        int result5 = Square.run(5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
