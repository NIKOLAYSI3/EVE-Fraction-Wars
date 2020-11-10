package fw;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


class Tier{
    protected int Novice = 10000;
    protected int Small = 17500;
    protected int Medium = 25000;
    protected int Large = 30000;
    protected int InfrastructureHub = 40000;
}

class Tier1 extends Tier{
    int value;

    String setValue(int i){
        return String.valueOf(value = i/2);
    }

    String getValue(){
        return "<html>Novice = "+setValue(Novice)+"<br>Small = "+setValue(Small)+"<br>Medium = "+setValue(Medium)+
                "<br>Large = "+setValue(Large)+"<br>InfrastructureHub = "+setValue(InfrastructureHub)+"</html>";
    }

}

class Tier2 extends Tier{
    int value;

    String setValue(int i){
        return String.valueOf(value = i);
    }

    String getValue(){
        return "<html>Novice = "+setValue(Novice)+"<br>Small = "+setValue(Small)+"<br>Medium = "+setValue(Medium)+
                "<br>Large = "+setValue(Large)+"<br>InfrastructureHub = "+setValue(InfrastructureHub)+"</html>";
    }
}

class Tier3 extends Tier{
    int value;

    String setValue(int i){
        return String.valueOf(value = (int) (i+(i*0.75)));
    }

    String getValue(){
        return "<html>Novice = "+setValue(Novice)+"<br>Small = "+setValue(Small)+"<br>Medium = "+setValue(Medium)+
                "<br>Large = "+setValue(Large)+"<br>InfrastructureHub = "+setValue(InfrastructureHub)+"</html>";
    }
}

class Tier4 extends Tier{
    int value;

    String setValue(int i){
        return String.valueOf(value = (int) (i+(i*1.5)));
    }

    String getValue(){
        return "<html>Novice = "+setValue(Novice)+"<br>Small = "+setValue(Small)+"<br>Medium = "+setValue(Medium)+
                "<br>Large = "+setValue(Large)+"<br>InfrastructureHub = "+setValue(InfrastructureHub)+"</html>";
    }
}

class Tier5 extends Tier{
    int value;

    String setValue(int i){
        return String.valueOf(value = (int) (i+(i*2.25)));
    }

    String getValue(){
        return "<html>Novice = "+setValue(Novice)+"<br>Small = "+setValue(Small)+"<br>Medium = "+setValue(Medium)+
                "<br>Large = "+setValue(Large)+"<br>InfrastructureHub = "+setValue(InfrastructureHub)+"</html>";
    }
}

public class Fraction_Wars_Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fraction_Wars_Window() {
		
		Tier1 tier1 = new Tier1();
		Tier2 tier2 = new Tier2();
		Tier3 tier3 = new Tier3();
		Tier4 tier4 = new Tier4();
		Tier5 tier5 = new Tier5();
		
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		setType(Type.POPUP);
		setTitle("Fraction Wars");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Z:\\Eclipse programs\\Fraction Wars\\src\\fw\\FW.png"));
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,280);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Tier 1");
		btnNewButton.setBounds(10, 54, 70, 34);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		getContentPane().add(btnNewButton);
	
		
		JButton btnTier = new JButton("Tier 2");
		btnTier.setBounds(90, 54, 70, 34);
		btnTier.setBackground(Color.LIGHT_GRAY);
		btnTier.setForeground(Color.BLACK);
		btnTier.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		getContentPane().add(btnTier);
		
		JButton btnTier_1 = new JButton("Tier 3");
		btnTier_1.setBounds(170, 54, 70, 34);
		btnTier_1.setBackground(Color.LIGHT_GRAY);
		btnTier_1.setForeground(Color.BLACK);
		btnTier_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		getContentPane().add(btnTier_1);
		
		JButton btnTier_2 = new JButton("Tier 4");
		btnTier_2.setBounds(250, 54, 70, 34);
		btnTier_2.setBackground(Color.LIGHT_GRAY);
		btnTier_2.setForeground(Color.BLACK);
		btnTier_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		getContentPane().add(btnTier_2);
		
		JButton btnTier_3 = new JButton("Tier 5");
		btnTier_3.setBounds(330, 54, 70, 34);
		btnTier_3.setBackground(Color.LIGHT_GRAY);
		btnTier_3.setForeground(Color.BLACK);
		btnTier_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		getContentPane().add(btnTier_3);
		
		JLabel lblNewLabel = new JLabel("Choose your tier");
		lblNewLabel.setBounds(138, 11, 129, 32);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		getContentPane().add(lblNewLabel);
		
		JLabel lblChooseSystemOf = new JLabel("Choose system percentage");
		lblChooseSystemOf.setBounds(484, 11, 199, 32);
		lblChooseSystemOf.setForeground(Color.WHITE);
		lblChooseSystemOf.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		getContentPane().add(lblChooseSystemOf);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(216, 99, 184, 136);
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(454, 99, 184, 111);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1.setForeground(SystemColor.controlHighlight);
		getContentPane().add(lblNewLabel_1_1);
		
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(50.0, 10.0, 99.9, 0.1));
		spinner.setBounds(564, 55, 53, 34);
		spinner.setBackground(SystemColor.scrollbar);
		spinner.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		getContentPane().add(spinner);
	
		DecimalFormat dec = new DecimalFormat("#.#");
		
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 int value1, value2, value3, value4;
				
				String x = dec.format(spinner.getValue());
				char one = x.charAt(0);
                char two = x.charAt(1);
                char three;
               
                try{
                	three = x.charAt(3);
                } catch (StringIndexOutOfBoundsException o){
                    three = '0';
                }
	
				String y = String.valueOf(one) + String.valueOf(two) + String.valueOf(three);
                int z =Integer.valueOf(y);
                double w = Double.valueOf(z);
                 
				w/=10;
				value1 = (int) (10000*(w/100)*0.75);
                value2 = (int) (17500*(w/100)*0.75);
                value3 = (int) (25000*(w/100)*0.75);
                value4 = (int) (30000*(w/100)*0.75);
				
				lblNewLabel_1_1.setText("<html>Novice = "+value1+"<br>Small = "+value2+"<br>Medium = "+value3+
                        "<br>Large = "+value4+"<html>");
			}
		});
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(tier1.getValue());
			}
		});
		btnTier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(tier2.getValue());
			}
		});
		btnTier_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(tier3.getValue());
			}
		});
		btnTier_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(tier4.getValue());
			}
		});
		btnTier_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText(tier5.getValue());
			}
		});
		
		
		setVisible(true);
	}

}
