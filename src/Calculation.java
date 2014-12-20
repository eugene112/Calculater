import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Calculation extends JFrame {
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
    JButton dva;
    JButton odin;
    JButton Minus;
    JButton comma;
    JButton cosinus;
    JButton cotangens;
    JButton tangens;
    JTextField countpanel;
    JButton numberPi;
    JButton smenaZnaka;
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
        DecimalFormat format = new DecimalFormat("#.##########");
       DecimalFormatSymbols dfs = new DecimalFormatSymbols();
      dfs.setDecimalSeparator('.');
        format.setDecimalFormatSymbols(dfs);
        String str = format.format(x);

 countpanel.setText(str);
    }


    public Calculation() {
        super("Calculator");
        setContentPane(votpanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        countpanel.setEditable(false);
        for (int i = 0; i <= 9; i++) {
            String str = String.valueOf(i);
            votpanel.getActionMap().put(str, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    countpanel.setText(countpanel.getText() + e.getActionCommand());
                }
            });
            votpanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) ('0' + i)), str);
        }
        String ops = "+-*/^";
        for (int i = 0; i < ops.length(); i++) {
            String str = "Op" + i;
            final char op = ops.charAt(i);
            votpanel.getActionMap().put(str, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!setFirstValue())
                        return;
                    countpanel.setText(countpanel.getText() + " " + op + " ");
                }
            });
            votpanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(op), str);
        }

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
                countpanel.setText("");

            }
        });
        smenaZnaka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;

                if (firstValue>0){
                    Double plus=Double.valueOf((countpanel.getText()));
                    setResult(plus*(-1));
                }
                if(firstValue<0){
                    Double minus=Double.valueOf((countpanel.getText()));
                    setResult(minus*(-1));
                }
                 }
        });


        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
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
                if (!setFirstValue())
                    return;
                countpanel.setText(countpanel.getText() + " - ");

            }
        });
        sinus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
               setResult(Math.sin(firstValue));
            }

        });
        cosinus.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                setResult(Math.cos(firstValue));
            }
        });
        tangens.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
               setResult(Math.tan(firstValue));
            }
        });
        cotangens.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                setResult((1.0 / (Math.tan(firstValue))));
            }
        });
        xVdvoike.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;

                setResult(Math.pow(firstValue, 2));
            }
        });
        root_xy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                countpanel.setText("(" + countpanel.getText() + ")" + "^");
            }
        });
        kopenb_dva.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                if(firstValue<0){
                    countpanel.setText("");
                }
                else {
                    setResult(Math.sqrt(firstValue));
                }

            }
        });
        kopenbXandY.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                countpanel.setText(countpanel.getText() + "√");
            }
        });
        logarifm.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                if(firstValue<0){
                    countpanel.setText("");
                }
                else{
                    setResult(Math.log(firstValue));
                }

            }
        });
        factorial.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!setFirstValue())
                    return;
                int l = (int) firstValue;
                if (l == 0) {
                    countpanel.setText("1");
                }
                if(l<0) {
                    countpanel.setText("");
                }
                else {
                    int f = 1;
                    for (int i = 1; i <= l; i++) {
                        int m = l - (l - i);
                        f = m * f;
                    }
                   setResult(f);

                }
            }
        });
        numberPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setResult((Math.PI));
            }
        });


        AbstractAction equalsAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Plus = countpanel.getText().indexOf("+");
                int Minus = countpanel.getText().indexOf("-");
                int Delete = countpanel.getText().indexOf("/");
                int multipli = countpanel.getText().indexOf("*");
                if (((Minus == 0) & (countpanel.getText().contains("+"))) || (countpanel.getText().contains("+"))) {
                    String StoD = countpanel.getText().substring(Plus + 2);
                    secondValue = Double.valueOf(StoD);
                    double summ = firstValue + secondValue;
                    setResult(summ);

                }
                if (((Minus == 0) & (countpanel.getText().contains("*"))) || (countpanel.getText().contains("*"))) {
                    String StoD = countpanel.getText().substring(multipli + 2);
                    secondValue = Double.valueOf(StoD);
                    double multi = firstValue * secondValue;
                    setResult(multi);

                }
                if (((Minus == 0) & (countpanel.getText().contains("/"))) || (countpanel.getText().contains("/"))) {
                    String StoD = countpanel.getText().substring(Delete + 2);
                    secondValue = Double.valueOf(StoD);
                    double delen = firstValue / secondValue;
                    setResult(delen);

                }
                if ((Minus == 0) & (countpanel.getText().substring(Minus + 1).contains("-"))) {
                    String newStoD = countpanel.getText().substring(Minus + 1);
                    int DvaMinusa = newStoD.indexOf("-");
                    String StoD = countpanel.getText().substring(DvaMinusa + 2);
                    secondValue = Double.valueOf(StoD);
                    double minus = firstValue - secondValue;
                    setResult(minus);

                }
                if ((Minus > 0) & (!countpanel.getText().contains("^"))) {
                    String StoD = countpanel.getText().substring(Minus + 2);
                    secondValue = Double.valueOf(StoD);
                    double minus = firstValue - secondValue;
                    setResult(minus);

                }
                try{
                    if (countpanel.getText().contains("^")) {
                        int m = countpanel.getText().indexOf("^");
                        String StoD = countpanel.getText().substring(m + 1);
                        secondValue = Double.valueOf(StoD);
                        double xVy = Math.pow(firstValue, secondValue);
                        setResult(xVy);
                    }
                }
                catch(NumberFormatException e1) {
                    countpanel.setText(countpanel.getText());
                }
                try {
                    if (countpanel.getText().contains("√")) {

                        int m = countpanel.getText().indexOf("√");
                        String StoD = countpanel.getText().substring(m + 1);
                        secondValue = Double.valueOf(StoD);


                        if (firstValue < 0) {
                            countpanel.setText("");
                        }
                        if (firstValue > 0) {
                            double xsqrty = Math.pow(firstValue, (1.0 / secondValue));
                            setResult(xsqrty);
                        }


                    }


            }
                catch(NumberFormatException e1){
                    countpanel.setText(firstValue + "√");
                }
            }



        };
        equalls.addActionListener(equalsAction);
        votpanel.getActionMap().put("Equals", equalsAction);
        votpanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Equals");


    }
}

















