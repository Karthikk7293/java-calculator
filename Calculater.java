import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;
import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;





public class Calculater implements ActionListener {

    JFrame frame;
    JLabel displayLabel;
    JLabel displayLabel2;

    boolean isSubOperatedClicked=false;
    boolean isDivisionOperatedClicked=false;
    boolean isPlusOperatedClicked=false;
    boolean isMulOperatedClicked=false;
    String oldValue;

    boolean plusButtonClicked=false;
    boolean subtractionButtonClicked=false;
    boolean mulButtonClicked=false;
    boolean divisionButtonClicked=false;


    JButton sevenButton;
    JButton eightButton; 
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton dotButton;
    JButton clearButton;
    JButton dotJButton;
    JButton equalButton;
    JButton plusButton;
    JButton subtrButton;
    JButton divisionButton;
    JButton multiplicationButton;

   

    public Calculater() {
        frame = new JFrame("Calculator"); // name of the application
        frame.setLayout(null);
        frame.setSize(440, 700); // size of the app
        frame.setLocation(380, 20); // margine from left corner of the screen

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel(""); // atribute for display
        displayLabel.setFont(new FontUIResource("arial", Font.ITALIC, 30));
        displayLabel.setBounds(50, 20, 350, 60);
        displayLabel.setBackground(Color.WHITE);
        displayLabel.setForeground(Color.BLACK);// this atribute for giving color for the leters on the dispaylabel
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(displayLabel);

        displayLabel2 = new JLabel(""); // atribute for second  display
        displayLabel2.setFont(new FontUIResource("arial", Font.ITALIC, 30));
        displayLabel2.setBounds(20, 20, 30, 60);
        displayLabel2.setBackground(Color.WHITE);
        displayLabel2.setForeground(Color.BLACK);// this atribute for giving color for the leters on the dispaylabel
        displayLabel2.setOpaque(true);
        displayLabel2.setHorizontalAlignment(SwingConstants.LEFT);
        frame.add(displayLabel2);

        sevenButton = new JButton("7");
        sevenButton.setBounds(20, 100, 80, 80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(120, 100, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(220, 100, 80, 80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setBounds(20, 200, 80, 80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setBounds(120, 200, 80, 80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setBounds(220, 200, 80, 80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setBounds(20, 300, 80, 80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(120, 300, 80, 80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(220, 300, 80, 80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(threeButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(20, 400, 80, 80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(zeroButton);

        dotButton = new JButton(".");
        dotButton.setBounds(120, 400, 80, 80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(220, 400, 80, 80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(equalButton);

        plusButton = new JButton("+");
        plusButton.setBounds(320, 400, 80, 80);
        plusButton.addActionListener(this);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        frame.add(plusButton);

        subtrButton = new JButton("-");
        subtrButton.setBounds(320, 300, 80, 80);
        subtrButton.addActionListener(this);
        subtrButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(subtrButton);

        divisionButton = new JButton("/");
        divisionButton.setBounds(320, 200, 80, 80);
        divisionButton.addActionListener(this);
        divisionButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(divisionButton);

        multiplicationButton = new JButton("x");
        multiplicationButton.setBounds(320, 100, 80, 80);
        multiplicationButton.addActionListener(this);
        multiplicationButton.setFont(new Font("arial", Font.PLAIN, 40));
        frame.add(multiplicationButton);

        clearButton =new JButton("clear");
        clearButton.setBounds(20, 500, 80, 80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("areal" ,Font.PLAIN, 20 ));
        frame.add(clearButton);

    
    }

    public static void main(final String[] args) {

        new Calculater();
    }

    public void actionPerformed(final ActionEvent e) {
   
    if (e.getSource()== sevenButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("7");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("7");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("7");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("7");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"7");
        }
    }else if(e.getSource()== eightButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("8");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("8");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("8");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("8");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"8");
        }

    }else if(e.getSource()== nineButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("9");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("9");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("9");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("9");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"9");
        }
        
    }else if(e.getSource()== fourButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("4");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("4");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("4");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("4");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"4");
        }
    }else if(e.getSource()== fiveButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("5");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("5");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("5");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("5");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"5");
        }

    }else if(e.getSource()== sixButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("6");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("6");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("6");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("6");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"6");
        }
        
    }else if(e.getSource()== oneButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("1");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("1");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("1");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("1");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"1");
        }

    }else if(e.getSource()== twoButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("2");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("2");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("2");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("2");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"2");
        }

    }else if(e.getSource()==threeButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("3");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("3");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("3");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("3");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"3");
        }

    }else if(e.getSource()== zeroButton){
        if(isPlusOperatedClicked){
            displayLabel.setText("0");
            isPlusOperatedClicked=false;
            plusButtonClicked=true;
        }else if(isSubOperatedClicked){
            displayLabel.setText("0");
            isSubOperatedClicked=false;
            subtractionButtonClicked=true;
        }else if(isMulOperatedClicked){
            displayLabel.setText("0");
            isMulOperatedClicked=false;
            mulButtonClicked=true;
        }else if(isDivisionOperatedClicked){
            displayLabel.setText("0");
            isDivisionOperatedClicked=false;
            divisionButtonClicked=true;
        }else{
            displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+"0");
        }

    }else if(e.getSource()==dotButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(displayLabel.getText()+".");

    }else if(e.getSource()==plusButton){
        isPlusOperatedClicked=true;
        oldValue=displayLabel.getText();
       displayLabel2.setText("+");
        displayLabel2.setHorizontalAlignment(SwingConstants.LEFT);
    }else if(e.getSource() == subtrButton){
        isSubOperatedClicked=true;
        oldValue=displayLabel.getText();
       displayLabel2.setText("-");
        displayLabel2.setHorizontalAlignment(SwingConstants.LEFT);
    }else if(e.getSource() == multiplicationButton){
        isMulOperatedClicked=true;
        oldValue=displayLabel.getText();
       displayLabel2.setText("x");
        displayLabel2.setHorizontalAlignment(SwingConstants.LEFT);
    }else if(e.getSource() == divisionButton){
        isDivisionOperatedClicked=true;
        oldValue=displayLabel.getText();
       displayLabel2.setText("/");
        displayLabel2.setHorizontalAlignment(SwingConstants.LEFT);
    }else if(e.getSource()==clearButton){
        displayLabel.setText("");
        displayLabel2.setText("");

    }else if(e.getSource() == equalButton){

       
       if(plusButtonClicked){
        String newValue = displayLabel.getText();
        float oldValueF =Float.parseFloat(oldValue);
        float newValueF =Float.parseFloat(newValue);
        float result = newValueF + oldValueF;
        displayLabel.setText(result+"");
        isPlusOperatedClicked=false;
       }else if(subtractionButtonClicked){
        String newValue = displayLabel.getText();
        float oldValueF =Float.parseFloat(oldValue);
        float newValueF =Float.parseFloat(newValue);
        float result = newValueF - oldValueF;
        displayLabel.setText(result+"");
        isSubOperatedClicked=false;
       }else if(mulButtonClicked){
        String newValue = displayLabel.getText();
        float oldValueF =Float.parseFloat(oldValue);
        float newValueF =Float.parseFloat(newValue);
        float result = newValueF * oldValueF;
        displayLabel.setText(result+""); 
       }else if(divisionButtonClicked){
        String newValue = displayLabel.getText();
        float oldValueF =Float.parseFloat(oldValue);
        float newValueF =Float.parseFloat(newValue);
        float result = newValueF / oldValueF;
        displayLabel.setText(result+"");
        isDivisionOperatedClicked=false;
       }
       
    }       
    
 }
   
}


    
