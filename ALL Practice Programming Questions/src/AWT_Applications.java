import java.awt.*;
public class AWT_Applications extends Frame {
	
	
	
		
	private String title;

	AWT_Applications(String title){
			setVisible(true);
			setSize(500 , 500);
			setTitle(title);
			
		}
	


		
	

	public static void main(String[] args) {
		
		
		AWT_Applications awt = new AWT_Applications("Hitesh");
		mylables ml = new mylables("Demonstrate Frames");
		
	
		
	}
	




}
