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

    boolean isOperatedClicked=false;
    boolean isDivisionOperatedClicked=false;
    boolean isPlusOperatedClicked=false;
    boolean isMulOperatedClicked=false;
    String oldValue;


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
        frame = new JFrame("Calculater"); // name of the application
        frame.setLayout(null);
        frame.setSize(440, 700); // size of the app
        frame.setLocation(380, 20); // margine from left corner of the screen

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel(""); // atribute for display
        displayLabel.setFont(new FontUIResource("arial", Font.ITALIC, 30));
        displayLabel.setBounds(20, 20, 380, 60);
        displayLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        displayLabel.setBackground(Color.WHITE);
        displayLabel.setForeground(Color.BLACK);// this atribute for giving color for the leters on the dispaylabel
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(displayLabel);

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

        clearButton =new JButton("clear");
        clearButton.setBounds(20, 500, 80, 80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("areal" ,Font.PLAIN, 20 ));
        frame.add(clearButton);


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

    
    }

    public static void main(final String[] args) {

        new Calculater();
    }

    public void actionPerformed(final ActionEvent e) {
   
    if (e.getSource()== sevenButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("7");

    }else if(e.getSource()== eightButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("8");

    }else if(e.getSource()== nineButton){
        displayLabel.setText("9");
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
    }else if(e.getSource()== fourButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("4");

    }else if(e.getSource()== fiveButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("5");

    }else if(e.getSource()== sixButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("6");
        
    }else if(e.getSource()== oneButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("1");

    }else if(e.getSource()== twoButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("2");

    }else if(e.getSource()==threeButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("3");

    }else if(e.getSource()== zeroButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText("0");

    }else if(e.getSource()==dotButton){
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setText(".");

    }else if(e.getSource()==clearButton){
        displayLabel.setText("");

    }else if(e.getSource()==plusButton){
        displayLabel.setText("+");
        displayLabel.setHorizontalAlignment(SwingConstants.LEFT);

    }else if(e.getSource() == subtrButton){
        displayLabel.setText("-");
        displayLabel.setHorizontalAlignment(SwingConstants.LEFT);
    }else if(e.getSource() == multiplicationButton){
        displayLabel.setText("x");
        displayLabel.setHorizontalAlignment(SwingConstants.LEFT);
    }else if(e.getSource() == divisionButton){
        displayLabel.setText("/");
        displayLabel.setHorizontalAlignment(SwingConstants.LEFT);
    }
        

    
}
   

}


    
