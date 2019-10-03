import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelCalc  extends JPanel implements ActionListener {
    private int operacion;
    private JButton btn1,
                            btn2,
                            btn3,
                            btn4,
                            btn5,
                            btn6,
                            btn7,
                            btn8,
                            btn9,
                            btn0,
                            btnsuma,
                            btnresta,
                            btnmulti,
                            btndiv,
                            btnigual;
    private JTextField texto;
    private Calculadora calc;

    public PanelCalc(){
        super();
        this.operacion=0;
        this.calc=new Calculadora();
        
        this.setPreferredSize(new Dimension(320,200));
        this.texto=new JTextField(23);
        this.add(this.texto);

        this.btn7=new JButton("7");
        this.add(this.btn7);
        this.btn7.addActionListener(this);

        this.btn8=new JButton("8");
        this.add(this.btn8);
        this.btn8.addActionListener(this);

        this.btn9=new JButton("9");
        this.add(this.btn9);
        this.btn9.addActionListener(this);

        this.btndiv=new JButton("/");
        this.add(this.btndiv);
        this.btndiv.addActionListener(this);

        this.btn4=new JButton("4");
        this.add(this.btn4);
        this.btn4.addActionListener(this);

        this.btn5=new JButton("5");
        this.add(this.btn5);
        this.btn5.addActionListener(this);

        this.btn6=new JButton("6");
        this.add(this.btn6);
        this.btn6.addActionListener(this);
        
        this.btnmulti=new JButton("X");
        this.add(this.btnmulti);
        this.btnmulti.addActionListener(this);

        this.btn1=new JButton("1");
        this.add(this.btn1);
        this.btn1.addActionListener(this);

        this.btn2=new JButton("2");
        this.add(this.btn2);
        this.btn2.addActionListener(this);

        this.btn3=new JButton("3");
        this.add(this.btn3);
        this.btn3.addActionListener(this);

        this.btnresta=new JButton("-");
        this.add(this.btnresta);
        this.btnresta.addActionListener(this);

        this.btn0=new JButton("0");
        this.add(this.btn0);
        this.btn0.addActionListener(this);

        this.btnigual=new JButton("=");
        this.btnigual.setBackground(Color.GREEN);
        this.btnigual.setOpaque(true);
        this.add(this.btnigual);
        this.btnigual.addActionListener(this);

        this.btnsuma=new JButton("+");
        this.add(this.btnsuma);
        this.btnsuma.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource()==btn7){
            this.texto.setText(this.texto.getText()+"7");
        }if (evt.getSource()==btn8){
            this.texto.setText(this.texto.getText()+"8");
        }if (evt.getSource()==btn9){
            this.texto.setText(this.texto.getText()+"9");
        }if (evt.getSource()==btn4){
            this.texto.setText(this.texto.getText()+"4");
        }if (evt.getSource()==btn5){
            this.texto.setText(this.texto.getText()+"5");
        }if (evt.getSource()==btn6){
            this.texto.setText(this.texto.getText()+"6");
        }if (evt.getSource()==btn1){
            this.texto.setText(this.texto.getText()+"1");
        }if (evt.getSource()==btn2){
            this.texto.setText(this.texto.getText()+"2");
        }if (evt.getSource()==btn3){
            this.texto.setText(this.texto.getText()+"3");
        }if (evt.getSource()==btn0){
            this.texto.setText(this.texto.getText()+"0");
        }if(evt.getSource()==btnsuma){
            this.calc.setNum1(Integer.parseInt(texto.getText()));
            this.texto.setText("");
            this.operacion=1;
        }if(evt.getSource()==btnresta){
            this.calc.setNum1(Integer.parseInt(texto.getText()));
            this.texto.setText("");
            this.operacion=2;
        }if(evt.getSource()==btnmulti){
            this.calc.setNum1(Integer.parseInt(texto.getText()));
            this.texto.setText("");
            this.operacion=3;
        }if(evt.getSource()==btndiv){
            this.calc.setNum1(Integer.parseInt(texto.getText()));
            this.texto.setText("");
            this.operacion=4;
        } if(evt.getSource()==btnigual){
            this.calc.setNum2(Integer.parseInt(texto.getText()));
            if(this.operacion==1){
                int res=this.calc.suma();
                this.texto.setText(""+res);
            }if(this.operacion==2){
                int res=this.calc.resta();
                this.texto.setText(""+res);
            }if(this.operacion==3){
                int res=this.calc.multi();
                this.texto.setText(""+res);
            }if(this.operacion==4){
                int res=this.calc.div();
                this.texto.setText(""+res);
            }
        }
    }
}