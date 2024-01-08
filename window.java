import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class window implements ActionListener{
    public static String numberText = "";
    public static String number2Text = "";
    public static String functionText = "";

    public static int operation = 0;
    public static int step = 0;

    public static JButton clrButton = new JButton("clr");
    public static JButton plusButton = new JButton("+");
    public static JButton subButton = new JButton("-");
    public static JButton multButton = new JButton("x");
    public static JButton divButton = new JButton("/");
    public static JButton eqButton = new JButton("=");

    public static JButton button0 = new JButton("0");
    public static JButton button1 = new JButton("1");
    public static JButton button2 = new JButton("2");
    public static JButton button3 = new JButton("3");
    public static JButton button4 = new JButton("4");
    public static JButton button5 = new JButton("5");
    public static JButton button6 = new JButton("6");
    public static JButton button7 = new JButton("7");
    public static JButton button8 = new JButton("8");
    public static JButton button9 = new JButton("9");

    public static JLabel number = new JLabel("" + numberText, JLabel.RIGHT);
    public static void main (String[] args) {
        win();

    }
    public static void win() {
        JFrame jFrame = new JFrame("Calculator");
        //Set Values for buttons
        plusButton.setBounds(500,470,70,70);
        plusButton.addActionListener(new window());
        subButton.setBounds(500,380,70,70);
        subButton.addActionListener(new window());
        multButton.setBounds(500,290,70,70);
        multButton.addActionListener(new window());
        divButton.setBounds(500,200,70,70);
        divButton.addActionListener(new window());
        eqButton.setBounds(500,560,70,70);
        eqButton.addActionListener(new window());
        clrButton.setBounds(500, 650, 70, 70);
        clrButton.addActionListener(new window());

        button0.setBounds(200,650,100,100);
        button0.addActionListener(new window());
        button1.setBounds(50,500,100,100);
        button1.addActionListener(new window());
        button2.setBounds(200,500,100,100);
        button2.addActionListener(new window());
        button3.setBounds(350,500,100,100);
        button3.addActionListener(new window());
        button4.setBounds(50,350,100,100);
        button4.addActionListener(new window());
        button5.setBounds(200,350,100,100);
        button5.addActionListener(new window());
        button6.setBounds(350,350,100,100);
        button6.addActionListener(new window());
        button7.setBounds(50,200,100,100);
        button7.addActionListener(new window());
        button8.setBounds(200,200,100,100);
        button8.addActionListener(new window());
        button9.setBounds(350,200,100,100);
        button9.addActionListener(new window());

        JPanel jPanel = new JPanel();
        JLabel title = new JLabel("Calculator", JLabel.LEFT);
        title.setBounds(10, 10, 200, 50);
        title.setFont(new Font("Serif", Font.PLAIN, 45));
        
        number.setBounds(-50, 60, 700, 50);
        number.setFont(new Font("Serif", Font.BOLD, 25));
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(700, 800);
        jFrame.add(title);
        jFrame.add(number);

        //add buttons
        jFrame.add(button0);
        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(button3);
        jFrame.add(button4);
        jFrame.add(button5);
        jFrame.add(button6);
        jFrame.add(button7);
        jFrame.add(button8);
        jFrame.add(button9);

        jFrame.add(subButton);
        jFrame.add(plusButton);
        jFrame.add(multButton);
        jFrame.add(divButton);
        jFrame.add(eqButton);
        jFrame.add(clrButton);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (step == 0) {
                numberText += "1";
                number.setText("" + numberText + functionText + number2Text);
            } else if (step == 1) {
                number2Text += "1";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == button2) {
            if (step == 0) {
                numberText += "2";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "2";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == button3) {
            if (step == 0) {
                numberText += "3";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "3";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == button4) {
            if (step == 0) {
                numberText += "4";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "4";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == button5) {
            if (step == 0) {
                numberText += "5";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "5";
                number.setText("" + numberText + functionText + number2Text);
            }
        }else if (e.getSource() == button6) {
            if (step == 0) {
                numberText += "6";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "6";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == button7) {
            if (step == 0) {
                numberText += "7";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "7";
                number.setText("" + numberText + functionText + number2Text);
            }
        }else if (e.getSource() == button8) {
            if (step == 0) {
                numberText += "8";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "8";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == button9) {
            if (step == 0) {
                numberText += "9";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1) {
                number2Text += "9";
                number.setText("" + numberText + functionText + number2Text);
            }
        }else if (e.getSource() == button0) {
            if (step == 0 && numberText.length()!=0) {
                numberText += "0";
                number.setText("" + numberText + functionText + number2Text);
            }else if (step == 1 && numberText.length()!=0) {
                number2Text += "0";
                number.setText("" + numberText + functionText + number2Text);
            }
        } else if (e.getSource() == plusButton) {
            if (step == 0 && numberText.length() > 0) {
                functionText = " + ";
                operation = 1;
                number.setText("" + numberText + functionText + number2Text);
                step = 1;
            } 
        } else if (e.getSource() == subButton) {
            if (step == 0 && numberText.length() > 0) {
                functionText = " - ";
                operation = 2;
                number.setText("" + numberText + functionText + number2Text);
                step = 1;
            }

        } else if (e.getSource() == multButton) {
            if (step == 0 && numberText.length() > 0) {
                functionText = " x ";
                operation = 3;
                number.setText("" + numberText + functionText + number2Text);
                step = 1;
            }

        } else if (e.getSource() == divButton) {
            if (step == 0 && numberText.length() > 0) {
                functionText = " / ";
                operation = 4;
                number.setText("" + numberText + functionText + number2Text);
                step = 1;
            }

        } else if (e.getSource() == eqButton) {
            if (step == 1 && number2Text.length() > 0) {
                step = 2;
                if (operation == 1) {
                    number.setText("" + (Integer.parseInt(numberText) + Integer.parseInt(number2Text)));
                } else if (operation == 2) {
                    number.setText("" + (Integer.parseInt(numberText) - Integer.parseInt(number2Text)));
                } else if (operation == 3) {
                    number.setText("" + (Integer.parseInt(numberText) * Integer.parseInt(number2Text)));
                } else if (operation == 4) {
                    number.setText("" + (Integer.parseInt(numberText) / Integer.parseInt(number2Text)));
                }
            }
        } else if (e.getSource() == clrButton) {
            numberText = "";
            number2Text = "";
            operation = 0;
            step = 0;
            number.setText("");
        }
        
    }
}