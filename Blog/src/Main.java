import InterfacePlayGround.Practice;
import InterfacePlayGround.Print;
import InterfacePlayGround.Welcome;

public class Main {

    public static void main(String args[]){

        Print practice = new Practice();
        practice.display();

        Print welcome = new Welcome();
        welcome.display();

        Practice sumOfTwo = new Practice();
        sumOfTwo.setA(32);
        int numA = sumOfTwo.getA();

        sumOfTwo.setB(43);
        int numB = sumOfTwo.getB();

        System.out.println(sumOfTwo.addTwoNumber());
        System.out.println(numA);
        System.out.println(numB);

    }
}
