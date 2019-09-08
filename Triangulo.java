import javax.swing.JOptionPane;
public class Triangulo{
    private double x1,
                   x2,
                   x3,
                   y1,
                   y2,
                   y3,
                   area; 
    
    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3){
       this.x1=x1;
       this.x2=x2;
       this.x3=x3;
       this.y1=y1;
       this.y2=y2;
       this.y3=y3;
       
    }
    public double area(){
        this.area=Math.abs((((x1*y2)+(x2*y3)+(x3*y1))-((x1*y3)+(x3*y2)+(x2*y1)))/2);
        return this.area;
    }
    public static void main(String[] args) {
        String x1;
        x1 = JOptionPane.showInputDialog("x1");
        int x11=Integer.parseInt(x1);

        String y1;
        y1 = JOptionPane.showInputDialog("y1");
        int y11=Integer.parseInt(y1);
       
        String x2;
        x2 = JOptionPane.showInputDialog("x2");
        int x22=Integer.parseInt(x2);

        String y2;
        y2 = JOptionPane.showInputDialog("y2");
        int y22=Integer.parseInt(y2);

        String x3;
        x3 = JOptionPane.showInputDialog("x3");
        int x33=Integer.parseInt(x3);

        String y3;
        y3 = JOptionPane.showInputDialog("y3");
        int y33=Integer.parseInt(y3);


        Triangulo at=new Triangulo(x11,y11,x22,y22,x33,y33);
        double area1=at.calculaArea();

        JOptionPane.showMessageDialog(null,"El área del triángulo es "+ area1);
    }
}