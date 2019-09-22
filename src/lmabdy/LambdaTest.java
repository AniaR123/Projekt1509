/*

package lmabdy;

public class LambdaTest {
    public static <MathOperation> void main(String[] args) {
        LambdaTest lambda = new LambdaTest();
        // z deklaracją typu
        MathOperation addition = (int a, int b) -> a + b;
        // bez deklaracji typu
        MathOperation substraction = (a, b) -> a - b;
        //z returnem
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        //bez returna i nawiasów
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5=" + lambda.operate(10, 5, addition));
        System.out.println("10-5=" + lambda.operate(10, 5, substraction));
        System.out.println("10*5=" + lambda.operate(10, 5, multiplication));
        System.out.println("10/5=" + lambda.operate(10, 5, division));

        GreetingService greetingService1 = message ->
                System.out.println("Hello "+ message);
        greetingService1.sayMessage("Janina");
        greetingService1.sayMessage("Roman");
    }
*/
/*
    }
    interface MathOperation {       //można w nowej klasie
        int operation(int a, int b);
    }
*//*

    interface GreetingService{
        void sayMessage (String message);
    }}
*/
/*    private int operate(int a, int b, MathOperation mo){
        return mo.operation(a,b);
    }
}

*/
