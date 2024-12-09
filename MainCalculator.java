import mypackage.Calculator;

public class Main 
{
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
    }
}

