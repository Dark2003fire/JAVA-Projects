import java.awt.*;
public class mylables extends Frame{
	
	mylables(String s){
		
		setVisible(true);
		setSize(500 , 500);
		

		Label one = new Label("Label One");
		Label two = new Label("Label Two");
		Label three = new Label("Label Three");
		
		setLayout(new FlowLayout());
		add(one);
		add(two);
		add(three);
	}
	

}
