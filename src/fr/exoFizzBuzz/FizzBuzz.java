package fr.exoFizzBuzz;

public class FizzBuzz {
    public static void fizzBuzz(int n){
        for (int i = 0; i < n; i++) {
            if (i/3 == 0)
                System.out.print("Fizz");
            if (i/5 == 0)
                System.out.println("Buzz");
            if (i/3 != 0 && i/5!=0)
                System.out.println(i);
        }
    }
}
