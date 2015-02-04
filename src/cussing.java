import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class cussing extends JFrame{

		private JTextField text;
		private JLabel points;
		private String score = "0";
		
		public cussing(){
			super("WTF DID YOU SAY?!");
			setLayout(new FlowLayout());
			
			text = new JTextField(10);
			add(text);
			
			points = new JLabel(score + " Points");
			add(points);
			
			thehandler handler = new thehandler();
			text.addActionListener(handler);
		}
		private class thehandler implements ActionListener{
			 public void actionPerformed(ActionEvent event){
				 String string = "";
				 int count = 0;
				 
				 if(event.getSource()==text)
					 string=event.getActionCommand();
				 	string.toLowerCase();
				 	String[] words = string.split("\\s+");
				 	for(int x=0;x<words.length;x++)
				 	{
				 		if (words[x].contains("shit")){
				 			count++;
				 		}
				 		if (words[x].contains("fuck")){
				 			count++;
				 		}
				 		if (words[x].contains("damn")){
				 			count++;
				 		}
				 		if (words[x].contains("bitch")){
				 			count++;
				 		}
				 		if (words[x].contains("ass")){
				 			count++;
				 		}
				 	}
				 JOptionPane.showMessageDialog(null, "Calculating..");
				 score = Integer.toString(count);
				 points.setText(score+ " Points");
			 }
		}
	}


