import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiCalculator {
private JFrame f;
private JTextField t;
double first;
double second;
double result;
String operation;
String answer;

//Launch the application.

public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                GuiCalculator window = new GuiCalculator();
                window.f.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}

//Create the application.

public GuiCalculator() {
initialize();
}

//Initialize the contents of the frame.

private void initialize() {
    f = new JFrame();
    f.setBounds(100, 100, 450, 570);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setLayout(null);

    JLabel l = new JLabel("SCIENTIFIC CALCULATOR");
    l.setFont(new Font("Tahoma", Font.PLAIN, 22));
    l.setBounds(91, 10, 335, 30);
    f.getContentPane().add(l);
    t = new JTextField();
    t.setFont(new Font("Tahoma", Font.PLAIN, 30));
    t.setBounds(10, 50, 416, 65);
    f.getContentPane().add(t);
    t.setColumns(10);

    JButton bR = new JButton("√");
    bR.setFont(new Font("Verdana", Font.PLAIN, 20));
    bR.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Math.sqrt(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText()+a);
            }
            catch(ArithmeticException arg0) {
                t.setText("Error");
            }
        }
    });
    bR.setBounds(178, 246, 77, 49);
    f.getContentPane().add(bR);

    JButton bBy = new JButton("1/x");
    bBy.setFont(new Font("Verdana", Font.PLAIN, 20));
    bBy.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a =1/ (Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bBy.setBounds(94, 246, 77, 49);
    f.getContentPane().add(bBy);

    JButton bPower = new JButton("^");
    bPower.setFont(new Font("Verdana", Font.PLAIN, 20));
    bPower.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(t.getText());
            t.setText("");
            operation="^";
        }
    }); 
    bPower.setBounds(10, 300, 77, 49);
    f.getContentPane().add(bPower);

    JButton bCube = new JButton("x³");
    bCube.setFont(new Font("Verdana", Font.PLAIN, 20));
    bCube.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(t.getText()));
            a=a*a*a;
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bCube.setBounds(10, 354, 77, 49);
    f.getContentPane().add(bCube);

    JButton bSqr = new JButton("x²");
    bSqr.setFont(new Font("Verdana", Font.PLAIN, 20));
    bSqr.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = (Double.parseDouble(t.getText()));
            a=a*a;
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bSqr.setBounds(10, 408, 77, 49);
    f.getContentPane().add(bSqr);

    JButton bEX = new JButton("e^x");
    bEX.setFont(new Font("Verdana", Font.PLAIN, 20));
    bEX.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.exp(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bEX.setBounds(10, 246, 77, 49);
    f.getContentPane().add(bEX);

    JButton bExpo = new JButton("n!");
    bExpo.setFont(new Font("Verdana", Font.PLAIN, 20));
    bExpo.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a =(Double.parseDouble(t.getText()));
            double f=1;
            while(a!=0)
            {
                f=f*a;
                a--;
            }
            t.setText("");
            t.setText(t.getText()+f);
        }
    });
    bExpo.setBounds(10, 462, 77, 49);
    f.getContentPane().add(bExpo);

    //operators
    JButton bA = new JButton("+");
    bA.setFont(new Font("Verdana", Font.PLAIN, 20));
    bA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(t.getText());
            t.setText("");
            operation="+";
        }
    });
    bA.setBounds(349, 246, 77, 49);
    f.getContentPane().add(bA);

    JButton bS = new JButton("-");
    bS.setFont(new Font("Verdana", Font.PLAIN, 22));
    bS.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(t.getText());
            t.setText("");
            operation="-";
        }
    });
    bS.setBounds(349, 300, 77, 49);
    f.getContentPane().add(bS);

    JButton bM = new JButton("*");
    bM.setFont(new Font("Verdana", Font.PLAIN, 21));
    bM.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(t.getText());
            t.setText("");
            operation="*";
        }
    });
    bM.setBounds(349, 354, 77, 49);
    f.getContentPane().add(bM);

    JButton bD = new JButton("/");
    bD.setFont(new Font("Verdana", Font.PLAIN, 20));
    bD.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(t.getText());
            t.setText("");
            operation="/";
        }
    });
    bD.setBounds(349, 408, 77, 49);
    f.getContentPane().add(bD);

    JButton bPlusMinus = new JButton("+/-");
    bPlusMinus.setFont(new Font("Verdana", Font.PLAIN, 21));
    bPlusMinus.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a=Double.parseDouble(String.valueOf(t.getText()));
            a=a*(-1);
            t.setText(String.valueOf(a));
        }
    });
    bPlusMinus.setBounds(94, 462, 77, 49);
    f.getContentPane().add(bPlusMinus);

    JButton bPercent = new JButton("%");
    bPercent.setFont(new Font("Verdana", Font.PLAIN, 20));
    bPercent.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(t.getText());
            t.setText("");
            operation="%";
        }
    });
    bPercent.setBounds(265, 246, 77, 49);
    f.getContentPane().add(bPercent);

    JButton bLn = new JButton("ln");
    bLn.setFont(new Font("Verdana", Font.PLAIN, 20));
    bLn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                double a = Math.log(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText()+a);
            }
            catch(ArithmeticException arg0){
                t.setText("Error");
            }
        }
    });
    bLn.setBounds(94, 192, 77, 49);
    f.getContentPane().add(bLn);

    JButton bLog = new JButton("Log\r\n");
    bLog.setFont(new Font("Verdana", Font.PLAIN, 20));
    bLog.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                double a=Math.log10(Double.parseDouble(t.getText()));
                t.setText("");
                t.setText(t.getText()+a);
            }
            catch(ArithmeticException arg0){
                t.setText("Error");
            }
        }
    });
    bLog.setBounds(10, 192, 77, 49);
    f.getContentPane().add(bLog);

    //numbers
    JButton b0 = new JButton("0");
    b0.setFont(new Font("Verdana", Font.PLAIN, 20));
    b0.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b0.getText();
            t.setText(number);
        }
    });
    b0.setBounds(178, 462, 77, 49);
    f.getContentPane().add(b0);

    JButton b1 = new JButton("1");
    b1.setFont(new Font("Verdana", Font.PLAIN, 20));
    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b1.getText();
            t.setText(number);
        }
    });
    b1.setBounds(94, 408, 77, 49);
    f.getContentPane().add(b1);

    JButton b2 = new JButton("2");
    b2.setFont(new Font("Verdana", Font.PLAIN, 20));
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b2.getText();
            t.setText(number);
        }
    });
    b2.setBounds(178, 408, 77, 49);
    f.getContentPane().add(b2);

    JButton b3 = new JButton("3");
    b3.setFont(new Font("Verdana", Font.PLAIN, 20));
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b3.getText();
            t.setText(number);
        }
    });
    b3.setBounds(265, 408, 77, 49);
    f.getContentPane().add(b3);

    JButton b4 = new JButton("4");
    b4.setFont(new Font("Verdana", Font.PLAIN, 20));
    b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b4.getText();
            t.setText(number);
        }
    });
    b4.setBounds(94, 354, 77, 49);
    f.getContentPane().add(b4);

    JButton b5 = new JButton("5");
    b5.setFont(new Font("Verdana", Font.PLAIN, 20));
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b5.getText();
            t.setText(number);
        }
    });
    b5.setBounds(178, 354, 77, 49);
    f.getContentPane().add(b5);

    JButton b6 = new JButton("6");
    b6.setFont(new Font("Verdana", Font.PLAIN, 20));
    b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b6.getText();
            t.setText(number);
        }
    });
    b6.setBounds(265, 354, 77, 49);
    f.getContentPane().add(b6);

    JButton b7 = new JButton("7");
    b7.setFont(new Font("Verdana", Font.PLAIN, 20));
    b7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b7.getText();
            t.setText(number);
        }
    });
    b7.setBounds(94, 300, 77, 49);
    f.getContentPane().add(b7);

    JButton b8 = new JButton("8");
    b8.setFont(new Font("Verdana", Font.PLAIN, 20));
    b8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b8.getText();
            t.setText(number);
        }
    });
    b8.setBounds(178, 300, 77, 49);
    f.getContentPane().add(b8);

    JButton b9 = new JButton("9");
    b9.setFont(new Font("Verdana", Font.PLAIN, 20));
    b9.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+b9.getText();
            t.setText(number);
        }
    });
    b9.setBounds(265, 300, 77, 49);
    f.getContentPane().add(b9);

    JButton bSin = new JButton("Sin");
    bSin.setFont(new Font("Verdana", Font.PLAIN, 20));
    bSin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.sin(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bSin.setBounds(178, 138, 77, 49);
    f.getContentPane().add(bSin);

    JButton bSinH = new JButton("Sinh");
    bSinH.setFont(new Font("Verdana", Font.BOLD, 15));
    bSinH.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.sinh(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bSinH.setBounds(178, 192, 77, 49);
    f.getContentPane().add(bSinH);

    JButton bCos = new JButton("Cos");
    bCos.setFont(new Font("Verdana", Font.PLAIN, 20));
    bCos.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.cos(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bCos.setBounds(265, 138, 77, 49);
    f.getContentPane().add(bCos);

    JButton bCosH = new JButton("Cosh");
    bCosH.setFont(new Font("Verdana", Font.BOLD, 15));
    bCosH.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.cos(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bCosH.setBounds(265, 192, 77, 49);
    f.getContentPane().add(bCosH);
    
    JButton bTan = new JButton("Tan");
    bTan.setFont(new Font("Verdana", Font.PLAIN, 20));
    bTan.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.tan(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bTan.setBounds(349, 138, 77, 49);
    f.getContentPane().add(bTan);

    JButton bTanH = new JButton("Tanh");
    bTanH.setFont(new Font("Verdana", Font.BOLD, 15));
    bTanH.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            double a = Math.tanh(Double.parseDouble(t.getText()));
            t.setText("");
            t.setText(t.getText()+a);
        }
    });
    bTanH.setBounds(349, 192, 77, 49);
    f.getContentPane().add(bTanH);

    JButton bClear = new JButton("C");
    bClear.setFont(new Font("Verdana", Font.PLAIN, 20));
    bClear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            t.setText(null);
        }
    });
    bClear.setBounds(10, 138, 77, 49);
    f.getContentPane().add(bClear);

    JButton bBackspace = new JButton("B");
    bBackspace.setFont(new Font("Verdana", Font.PLAIN, 20));
    bBackspace.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String backSpace=null;
            if(t.getText().length()>0){
                StringBuilder str=new StringBuilder(t.getText());
                str.deleteCharAt(t.getText().length()-1);
                backSpace=str.toString();
                t.setText(backSpace);
            }
        }
    });
    bBackspace.setBounds(94, 138, 77, 49);
    f.getContentPane().add(bBackspace);

    JButton bDot = new JButton(".");
    bDot.setFont(new Font("Verdana", Font.PLAIN, 25));
    bDot.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String number=t.getText()+bDot.getText();
            t.setText(number);
        }
    });
    bDot.setBounds(265, 462, 77, 49);
    f.getContentPane().add(bDot);

    //equals
    JButton bEqual = new JButton("=");
    bEqual.setFont(new Font("Verdana", Font.PLAIN, 22));
    bEqual.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String answer;
            second=Double.parseDouble(t.getText());
            try{
                if(operation=="+"){
                    result=first+second;
                    answer=String.format("%.2f", result);
                    t.setText(answer);
                }
                else if(operation=="-"){
                    result=first-second;
                    answer=String.format("%.2f", result);
                    t.setText(answer);
                }
                else if(operation=="*"){
                    result=first*second;
                    answer=String.format("%.2f", result);
                    t.setText(answer);
                }
                else if(operation=="/"){
                    try {
                        result=first/second;
                        answer=String.format("%.2f", result);
                        t.setText(answer);
                    }
                    catch(ArithmeticException arg0){
                        t.setText("error");
                    }
                }
                else if(operation=="%"){
                    result=first%second;
                    answer=String.format("%.2f", result);
                    t.setText(answer);
                }
                else if(operation=="^"){
                    double resultt=1;
                    for(int i=0;i<second;i++){
                        resultt=first*resultt;
                        answer=String.format("%.2f", resultt);
                        t.setText(answer);
                    }
                }
            }
            catch(ArithmeticException arg0){
                t.setText("error");
            }
        }
    });
    bEqual.setBounds(349, 462, 77, 49);
    f.getContentPane().add(bEqual);
}
}
