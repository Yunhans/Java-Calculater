import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class mainFrame extends JFrame implements ActionListener{
    private JLabel screen;
    private JButton factorialBtn, reciprocalBtn, sinBtn, cosBtn, tanBtn, rootBtn, logBtn;
    private JButton addBtn, minusBtn, multiplicationBtn, divisionBtn;
    private JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn;
    private JButton dotBtn, clearBtn, equalBtn;

    private String number = "0";
    private calculate cal = new calculate();
    private boolean dotCheck = false;
    private boolean operatorCheck = false;

    public mainFrame(){
        setTitle("計算機");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,500);
        setLocationRelativeTo(null);
        setResizable(false); // 設定無法改變視窗大小
        setLayout(new BorderLayout());

        //上方顯示螢幕
        JPanel showPanel = new JPanel();
        showPanel.setLayout(new FlowLayout());
        add(showPanel, BorderLayout.NORTH);

        Font font = new Font("SansSerif", Font.BOLD, 30);
        screen = new JLabel(number);
        screen.setFont(font);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setPreferredSize(new Dimension(420, 100));
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        screen.setBorder(loweredbevel);
        showPanel.add(screen);


        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout());
        add(btnPanel, BorderLayout.CENTER);

        //功能鍵
        factorialBtn = new JButton("n!");
        factorialBtn.setPreferredSize(new Dimension(80, 60));
        factorialBtn.addActionListener(this);
        btnPanel.add(factorialBtn);

        reciprocalBtn = new JButton("1/x");
        reciprocalBtn.setPreferredSize(new Dimension(80, 60));
        reciprocalBtn.addActionListener(this);
        btnPanel.add(reciprocalBtn);

        sinBtn = new JButton("sin");
        sinBtn.setPreferredSize(new Dimension(80, 60));
        sinBtn.addActionListener(this);
        btnPanel.add(sinBtn);

        cosBtn = new JButton("cos");
        cosBtn.setPreferredSize(new Dimension(80, 60));
        cosBtn.addActionListener(this);
        btnPanel.add(cosBtn);

        tanBtn = new JButton("tan");
        tanBtn.setPreferredSize(new Dimension(80, 60));
        tanBtn.addActionListener(this);
        btnPanel.add(tanBtn);

        sevenBtn = new JButton("7");
        sevenBtn.setPreferredSize(new Dimension(80, 60));
        sevenBtn.addActionListener(this);
        btnPanel.add(sevenBtn);

        eightBtn = new JButton("8");
        eightBtn.setPreferredSize(new Dimension(80, 60));
        eightBtn.addActionListener(this);
        btnPanel.add(eightBtn);

        nineBtn = new JButton("9");
        nineBtn.setPreferredSize(new Dimension(80, 60));
        nineBtn.addActionListener(this);
        btnPanel.add(nineBtn);

        rootBtn = new JButton("√");
        rootBtn.setPreferredSize(new Dimension(80, 60));
        rootBtn.addActionListener(this);
        btnPanel.add(rootBtn);

        logBtn = new JButton("log");
        logBtn.setPreferredSize(new Dimension(80, 60));
        logBtn.addActionListener(this);
        btnPanel.add(logBtn);

        fourBtn = new JButton("4");
        fourBtn.setPreferredSize(new Dimension(80, 60));
        fourBtn.addActionListener(this);
        btnPanel.add(fourBtn);

        fiveBtn = new JButton("5");
        fiveBtn.setPreferredSize(new Dimension(80, 60));
        fiveBtn.addActionListener(this);
        btnPanel.add(fiveBtn);

        sixBtn = new JButton("6");
        sixBtn.setPreferredSize(new Dimension(80, 60));
        sixBtn.addActionListener(this);
        btnPanel.add(sixBtn);

        addBtn = new JButton("+");
        addBtn.setPreferredSize(new Dimension(80, 60));
        addBtn.addActionListener(this);
        btnPanel.add(addBtn);

        multiplicationBtn = new JButton("x");
        multiplicationBtn.setPreferredSize(new Dimension(80, 60));
        multiplicationBtn.addActionListener(this);
        btnPanel.add(multiplicationBtn);

        oneBtn = new JButton("1");
        oneBtn.setPreferredSize(new Dimension(80, 60));
        oneBtn.addActionListener(this);
        btnPanel.add(oneBtn);

        twoBtn = new JButton("2");
        twoBtn.setPreferredSize(new Dimension(80, 60));
        twoBtn.addActionListener(this);
        btnPanel.add(twoBtn);

        threeBtn = new JButton("3");
        threeBtn.setPreferredSize(new Dimension(80, 60));
        threeBtn.addActionListener(this);
        btnPanel.add(threeBtn);

        minusBtn = new JButton("-");
        minusBtn.setPreferredSize(new Dimension(80, 60));
        minusBtn.addActionListener(this);
        btnPanel.add(minusBtn);

        divisionBtn = new JButton("/");
        divisionBtn.setPreferredSize(new Dimension(80, 60));
        divisionBtn.addActionListener(this);
        btnPanel.add(divisionBtn);

        zeroBtn = new JButton("0");
        zeroBtn.setPreferredSize(new Dimension(80, 60));
        zeroBtn.addActionListener(this);
        btnPanel.add(zeroBtn);

        dotBtn = new JButton(".");
        dotBtn.setPreferredSize(new Dimension(80, 60));
        dotBtn.addActionListener(this);
        btnPanel.add(dotBtn);

        clearBtn = new JButton("clear");
        clearBtn.setPreferredSize(new Dimension(80, 60));
        clearBtn.addActionListener(this);
        btnPanel.add(clearBtn);

        equalBtn = new JButton("=");
        equalBtn.setPreferredSize(new Dimension(165, 60));
        equalBtn.addActionListener(this);
        btnPanel.add(equalBtn);

        JPanel showDevloperPanel = new JPanel();
        JLabel showDevloperLabel = new JLabel("中央資管110石昀翰  ");
        showDevloperPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        showDevloperPanel.add(showDevloperLabel);
        add(showDevloperPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        // 輸入數字
        if(e.getSource() == zeroBtn || e.getSource() == oneBtn || e.getSource() == twoBtn || e.getSource() == threeBtn || e.getSource() == fourBtn || e.getSource() == fiveBtn || e.getSource() == sixBtn || e.getSource() == sevenBtn || e.getSource() == eightBtn || e.getSource() == nineBtn){
            if(number.equals("0") || operatorCheck){
                number = "";
            }
            number += e.getActionCommand();
            screen.setText(number);
            operatorCheck = false;
        }

        // 小數點
        if(e.getSource() == dotBtn){
            if(!dotCheck){
                number += e.getActionCommand();
            }
            dotCheck = true;
            screen.setText(number);
            operatorCheck = false;
        }

        // n!
        if(e.getSource() == factorialBtn){
            if(!dotCheck){
                number = cal.factorial(number);
                screen.setText(number);
                dotCheck = false;
            }
        }

        // 1/x
        if(e.getSource() == reciprocalBtn){
            number = cal.reciprocal(number);
            screen.setText(number);
            dotCheck = false;
        }

        // sin, cos, tan
        if(e.getSource() == sinBtn || e.getSource() == cosBtn || e.getSource() == tanBtn){
            if(e.getSource() == sinBtn){
                number = cal.sin(number);
            }
            if(e.getSource() == cosBtn){
                number = cal.cos(number);
            }
            if(e.getSource() == tanBtn){
                number = cal.tan(number);
            }
            screen.setText(number);
            dotCheck = false;
        }

        // √ 
        if(e.getSource() == rootBtn){
            number = cal.root(number);
            screen.setText(number);
            dotCheck = false;
        }

        // log
        if(e.getSource() == logBtn){
            number = cal.log(number);
            screen.setText(number);
            dotCheck = false;
        }

        // +
        if(e.getSource() == addBtn){
            number = cal.add(number);
            screen.setText(number);
            operatorCheck = true;
            dotCheck = false;
        }

        // -
        if(e.getSource() == minusBtn){
            number = cal.minus(number);
            screen.setText(number);
            operatorCheck = true;
            dotCheck = false;
        }

        // x
        if(e.getSource() == multiplicationBtn){
            number = cal.multiplication(number);
            screen.setText(number);
            operatorCheck = true;
            dotCheck = false;
        }

        // division
        if(e.getSource() == divisionBtn){
            number = cal.division(number);
            screen.setText(number);
            operatorCheck = true;
            dotCheck = false;
        }

        // =
        if(e.getSource() == equalBtn){
            number = cal.equal(number);
            screen.setText(number);
            operatorCheck = true;
            dotCheck = false;
        }

        // clear
        if(e.getSource() == clearBtn){
            number = "0";
            dotCheck = false;
            operatorCheck = false;
            cal.clear();
            screen.setText(number);
        }
    }

}
