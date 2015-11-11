package gui.veiw;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
 private GUIAppController baseController;
 private JButton firstButton;
 private JTextField firstTextField;
 private SpringLayout baseLayout;
 public GUIPanel(GUIAppController baseController)
 {
	 this.baseController = baseController;
	 
	 baseLayout = new SpringLayout();
	 firstButton = new JButton("Please do not click the button");
	 firstTextField = new JTextField("words can be typed here");
	 
	 setupPanel();
	 setupLayout();
	 setupListeners();
 }
   private void setupPanel()
   {
	   this.setLayout(baseLayout);
	   this.add(firstButton);
	   this.add(firstTextField);
   }
   private void setupLayout()
   {
	   this.add(firstButton);
	   this.add(firstTextField);
   }
   private void setupListeners()
   {
	   
   }
}
