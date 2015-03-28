package file_handling;

import java.util.Formatter;
import javax.swing.JOptionPane;
import java.io.File;

public class File_getData {

	private Formatter x;
	private JOptionPane jop;
	private File	fc;

	String fname ; 
	String lname;
	String favNumber;
		
			
		public void getData(){
			
			try{
				
				jop = new JOptionPane();
				
				fname = jop.showInputDialog("Enter your First name");
				lname = jop.showInputDialog("Enter your Last name");
				favNumber = jop.showInputDialog("Enter your favourite number");
				
				
			}catch(Exception ex){
				
				System.out.println("The error occured :"+ ex.getLocalizedMessage());
				
			}
			
		}
		
		public void openFile(){
			
			try{
				
				try{
				
				fc = new File("D:\\Record.txt");
				
				if (fc.exists()){
				x = new Formatter("D:\\Record1.txt");	// Write the directory (Mine is drive : "D :\")
				}
				else{				
				x = new Formatter("D:\\Record2.txt");	
					
				}
				
				}
				catch(Exception exc){
					
					System.out.println("The error occured  :"+ exc.getLocalizedMessage());
					
				}
				
			}catch(Exception e){
				
				System.out.println("File could not be opened .");
				System.out.println("The eror occured is : "+ e.getLocalizedMessage());
				
			}
			
		}

			
		public void addRecord(){
			
			x.format("FirstName : %s\n SecondName : %s\n FavouriteNumber : %s\n" ,fname , lname , favNumber );
			
		}
		
		public void closeFile(){
			
			x.close();
			
						
		}
}
