class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalculator extends Calculator{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

class VeryAdvCalculator extends AdvCalculator{
    public double power(double a, double b){
        return Math.pow(a,b);
    }
}



public class inheritance {
    public static void main(String[] args) {
         VeryAdvCalculator cal = new VeryAdvCalculator();
         System.out.println(cal.add(5,10));
         System.out.println(cal.mul(5,10));
         System.out.println(cal.power(5,2));

    }
}