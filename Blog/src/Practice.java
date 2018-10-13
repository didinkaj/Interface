
public class Practice implements Print {
    private int a;
    private int b;

    public Practice() {

    }


    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }


    public void setB(int b){
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int addTwoNumber(){

        return a+b;

    }

    @Override
    public void display() {
         System.out.println("This is from the practise class");
    }
}
