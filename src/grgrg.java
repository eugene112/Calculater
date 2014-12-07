import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class grgrg extends JFrame {
    JPanel votpanel;
    JButton equalls;
    JButton five;
    JButton kopenb_dva;
    JButton seven;
    JButton nine;
    JButton four;
    JButton six;
    JButton eight;
    JButton nolb;
    JButton sinus;
    JButton tri;
    JButton kopenbXandY;
    JButton divide;
    JButton multiplication;
    JButton xVdvoike;
    JButton plus;
    JButton Cleanlast;
    JButton logarifm;
    JButton root_xy;
    JButton factorial;
    JButton surprise;
    JButton dva;
    JButton odin;
    JButton Minus;
    JButton comma;
    JButton cosinus;
    JButton cotangens;
    JButton tangens;
    JTextField countpanel;
   JButton numberPi;
    double firstValue;
    double secondValue;

    private boolean setFirstValue() {
        try {
            firstValue = Double.parseDouble(countpanel.getText());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private void setResult(double x) {
        String str = new DecimalFormat("#.##########").format(x);
        countpanel.setText(str);
    }


    public grgrg() {
        super("CalculatorForGangsta");
        setContentPane(votpanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        countpanel.setEditable(false);
       /* for (int i = 0; i <= 9; i++) {
            String str = String.valueOf(i);
            votpanel.getActionMap().put(str, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    countpanel.setText(countpanel.getText() + e.getActionCommand());
                }
            });
            votpanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) ('0' + i)), str);
        }*/
        //todo:Не выходит с привязкой клавиш,т.к. алгоритм расчета завязан на строках ,а там идет тип char,как я понял
        votpanel.setFocusable(true);
        votpanel.requestFocus();


        nolb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "0");
            }
        });
        odin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "1");
            }
        });
        dva.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "2");
            }
        });
        tri.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "3");

            }
        });
        four.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + "9");
            }
        });
        comma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countpanel.setText(countpanel.getText() + ".");
            }
        });
        Cleanlast.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String temp = countpanel.getText();
                countpanel.setText(temp.substring(0, 0));

            }
        });


        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if( !setFirstValue())
                return;
                countpanel.setText(countpanel.getText() + " + ");

            }
        });
        multiplication.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                countpanel.setText(countpanel.getText() + " * ");

            }
        });
        divide.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                countpanel.setText(countpanel.getText() + " / ");

            }
        });
        Minus.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                countpanel.setText(countpanel.getText() + " - ");

            }
        });
        sinus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
               setResult(Math.sin(firstValue));
            }

        });
        cosinus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                setResult(Math.cos(firstValue));
            }
        });
        tangens.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                setResult(Math.tan(firstValue));
            }
        });
        cotangens.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                setResult((1.0 / (Math.tan(firstValue))));
            }
        });
        xVdvoike.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                setResult(Math.pow(firstValue, 2));
            }
        });
        root_xy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                countpanel.setText("(" + countpanel.getText() + ")" + "^");
            }
        });
        kopenb_dva.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                setResult(Math.sqrt(firstValue));
            }
        });
        kopenbXandY.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                countpanel.setText(countpanel.getText() + "√");
            }
        });
        logarifm.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                setResult(Math.log(firstValue));
            }
        });
        factorial.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if(!setFirstValue())
                    return;
                 int l = (int) firstValue;
                        if (l == 0) {
                            countpanel.setText("1");
                        } else {
                            int f = 1;
                            for (int i = 1; i <= l; i++) {
                                int m = l - (l - i);
                                f = m * f;
                            }
                            countpanel.setText(String.valueOf(f));

                        }
                   }
        });
        numberPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countpanel.setText(String.valueOf(Math.PI));
            }
        });



        equalls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (countpanel.getText().contains("+")) {
                    int m = countpanel.getText().indexOf("+");
                    String StoD = countpanel.getText().substring(m + 2);
                    secondValue = Double.valueOf(StoD);
                    double summa = firstValue + secondValue;
                    setResult(summa);
                }
                if (countpanel.getText().contains("*")) {
                    int m = countpanel.getText().indexOf("*");
                    String StoD = countpanel.getText().substring(m + 2);
                    secondValue = Double.valueOf(StoD);
                    double multi = firstValue * secondValue;
                    setResult(multi);
                }
                if (countpanel.getText().contains("/")) {
                    int m = countpanel.getText().indexOf("/");
                    String StoD = countpanel.getText().substring(m + 2);
                    secondValue = Double.valueOf(StoD);
                    double delen = firstValue / secondValue;
                    setResult(delen);
                }
                if (countpanel.getText().contains("-")) {
                    int m = countpanel.getText().indexOf("-");
                    String StoD = countpanel.getText().substring(m + 2);
                    secondValue = Double.valueOf(StoD);
                    double minus = firstValue - secondValue;
                    setResult(minus);
                }
                if (countpanel.getText().contains("^")) {
                    int m = countpanel.getText().indexOf("^");
                    String StoD = countpanel.getText().substring(m + 1);
                    secondValue = Double.valueOf(StoD);
                    double xVy = Math.pow(firstValue, secondValue);
                    setResult(xVy);
                }
                if (countpanel.getText().contains("√")) {
                    int m = countpanel.getText().indexOf("√");
                    String StoD = countpanel.getText().substring(m + 1);
                    secondValue = Double.valueOf(StoD);
                    double xsqrty = Math.pow(firstValue, (1.0 / secondValue));
                    setResult(xsqrty);
                }


            }
        });


    }
}

















