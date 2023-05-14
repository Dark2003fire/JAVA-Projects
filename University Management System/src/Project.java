import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener {
	
	
	Project(){
		
		
		setSize(1500  , 800);
		
		// We have to change the image with high resolution
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/university.png"));// This method id used to add the image or icon in the Application
		//JLabel image = new JLabel(i1); //To add image directly on the Frame we have use this method;
		Image i2 = i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);// To set the image with proper height and width we can use this method.
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);
		
		JMenuBar mb = new JMenuBar();
		
		
		//New informatio Menu
		JMenu newInformation = new JMenu("New Information");
		mb.add(newInformation);
		// newInformation.setForeground(Color.BLACK);// To change the color of the Menu names
		
		
		JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
		facultyInfo.setBackground(Color.WHITE); // to give the background color 
		newInformation.add(facultyInfo);
		
		
		JMenuItem studentInfo = new JMenuItem("New Student Information");
		studentInfo.setBackground(Color.WHITE); // to give the background color 
		newInformation.add(studentInfo);
		
		
		// Details 
		JMenu details = new JMenu("View Details");
		mb.add(details);
		// newInformation.setForeground(Color.BLACK);// To change the color of the Menu names
		
		
		JMenuItem facultydetails = new JMenuItem("View Faculty Details");
		facultydetails.setBackground(Color.WHITE); // to give the background color 
		details.add(facultydetails);
		
		
		JMenuItem studentDetails = new JMenuItem("View Student Details");
		studentDetails.setBackground(Color.WHITE); // to give the background color 
		details.add(studentDetails);
		
		
		     // Leave
			JMenu leave = new JMenu("Apply Leave");
			mb.add(leave);
			// newInformation.setForeground(Color.BLACK);// To change the color of the Menu names
				
				
			JMenuItem facultyLeave = new JMenuItem(" Faculty Leave");
			facultyLeave.setBackground(Color.WHITE); // to give the background color 
			leave.add(facultyLeave);
				
				
			JMenuItem studentLeave = new JMenuItem(" Student Leave");
			studentLeave.setBackground(Color.WHITE); // to give the background color 
			leave.add(studentLeave);
			
			  // Leave Details
			JMenu leaveDetails = new JMenu(" Leave Details");
			mb.add(leaveDetails);
			// newInformation.setForeground(Color.BLACK);// To change the color of the Menu names
				
				
			JMenuItem facultyLeaveDetails = new JMenuItem(" Faculty Leave Details");
			facultyLeaveDetails.setBackground(Color.WHITE); // to give the background color 
			leaveDetails.add(facultyLeaveDetails);
				
				
			JMenuItem studentLeaveDetails = new JMenuItem(" Student Leave Details");
			studentLeaveDetails.setBackground(Color.WHITE); // to give the background color 
			leaveDetails.add(studentLeaveDetails);
			
			
			  // Examination
			JMenu examination = new JMenu(" Examination ");
			mb.add(examination);
			// newInformation.setForeground(Color.BLACK);// To change the color of the Menu names
				
				
			JMenuItem examinationdetails = new JMenuItem("Examination Results");
			examinationdetails.setBackground(Color.WHITE); // to give the background color 
			examination.add(examinationdetails);
				
				
			JMenuItem examinationmarks = new JMenuItem(" Enter Marks");
			examinationmarks.setBackground(Color.WHITE); // to give the background color 
			examination.add(examinationmarks);
			
			
			  // Update information
			JMenu Updateinfo = new JMenu(" Update Details ");
			mb.add(Updateinfo);
			// newInformation.setForeground(Color.BLACK);// To chan ge the color of the Menu names
				
				
			JMenuItem updateFacultyinfo = new JMenuItem("Update Faculty Details");
			updateFacultyinfo.setBackground(Color.WHITE); // to give the background color 
			Updateinfo.add(updateFacultyinfo);
				
				
			JMenuItem updateStudentinfo = new JMenuItem("Update Student Details");
			updateStudentinfo.setBackground(Color.WHITE); // to give the background color 
			Updateinfo.add(updateStudentinfo);
			
			
			// Fees  information
			JMenu fees = new JMenu(" Fees Details ");
			mb.add(fees);
						// newInformation.setForeground(Color.BLACK);// To chan ge the color of the Menu names
							
							
			JMenuItem feesStructure = new JMenuItem("Fees Strcuture");
			feesStructure.setBackground(Color.WHITE); // to give the background color 
			fees.add(feesStructure);
							
							
			JMenuItem feesform = new JMenuItem("Students Fees Form");
			feesform.setBackground(Color.WHITE); // to give the background color 
			fees.add(feesform);
			
			// Open Utility information
			JMenu utility = new JMenu(" Utility ");
			mb.add(utility);
									// newInformation.setForeground(Color.BLACK);// To chan ge the color of the Menu names
										
										
			JMenuItem notepad = new JMenuItem("Open Notepad");
			notepad.setBackground(Color.WHITE); // to give the background color 
			notepad.addActionListener(this);
			utility.add(notepad);
										
										
			JMenuItem calculator = new JMenuItem("Open Calculator");
			calculator.setBackground(Color.WHITE); // to give the background color 
			calculator.addActionListener(this);
			utility.add(calculator);
			
			
			
			// Exit Menu
			JMenu exit = new JMenu(" Exit ");
			mb.add(exit);
									// newInformation.setForeground(Color.BLACK);// To chan ge the color of the Menu names
										
										
			JMenuItem exit1 = new JMenuItem("Exit");
			exit1.setBackground(Color.WHITE);// to give the background color
			exit1.addActionListener(this);
			exit.add(exit1);
			
			
			
			/*
			JMenuItem exits = new JMenuItem("Exit Parameters");
			exits.setBackground(Color.white);
			exits.add(exits);
			
			*/
			
			 
				
		
		
		    setJMenuBar(mb);
		    
		
		
		
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String msg = ae.getActionCommand();
		
		if(msg.equals("Exit")) {
			
			
			
			setVisible(false);
			
		}else if (msg.equals("Open Calculator")) {
			
			try {
				
				Runtime.getRuntime().exec("clac.exe");
				
				
			}catch(Exception e) {
				
				
				
			}
		}else if (msg.equals("Open Notepad")) {
			
			try {
				
				Runtime.getRuntime().exec("notepad.exe");
				
				
			}catch(Exception e) {
				
				
				
			}
		}
		
		
		
		
	}

	

	public static void main(String[] args) {
		
		
		new Project();
		

	}

}
