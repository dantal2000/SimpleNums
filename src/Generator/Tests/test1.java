package Generator.Tests;

import Generator.Model_1;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        Model_1 generator = new Model_1();
        Random random = new Random();
        int c = random.nextInt(1000000);
        System.out.println("Test #1: The " + c + " is " + (generator.isSimple(c) ? "" : "not") + " simple");
        System.out.print("Test #2: The first simple in range of 10 to 20 is ");
        try {
            System.out.println(generator.getSimpleInRange(10, 20));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Test #3: There are simples of range of 10 to 100: ");
        int counter = 0;
        try {
            for (int a : generator.getSimplesInRange(1, 100)) {
                System.out.println(a);
                counter++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("In all: " + counter);
    }
}
