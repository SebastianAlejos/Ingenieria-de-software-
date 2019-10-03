public class Calculadora {
    private int num1,
                     num2;

    public Calculadora(){
        this.num1=0;
        this.num2=0;
    }
    public int suma(){
        return this.num1+this.num2;
    }
    public int resta(){
        return this.num1-this.num2;
    }
    public int multi(){
        return this.num1*this.num2;
    }
    public int div(){
        return this.num1/this.num2;
    }
   
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}