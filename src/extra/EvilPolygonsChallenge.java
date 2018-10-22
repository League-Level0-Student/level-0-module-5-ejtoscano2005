package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot a = new Robot();
		//2. Set the speed to 100
a.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello what color would you like?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Yellow", "Orange", "Green", "Purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
if(colorChoice == 0) {
a.setPenColor(Color.red);
}		
if(colorChoice == 1) {
a.setPenColor(Color.blue);
}
if(colorChoice == 2) {
a.setPenColor(Color.yellow);
}		
if(colorChoice == 3) {
a.setPenColor(Color.orange);
}
if(colorChoice == 4) {
a.setPenColor(Color.green);
}
if(colorChoice == 5) {
a.setPenColor(128, 0, 128);
}
//4. Ask the use how many polygons they want to be drawn.
String b = JOptionPane.showInputDialog("How many polygons would you like?");		
		//5. Use the robot to draw the number of polygons the user requested.

int c = Integer.parseInt(b);
for( int e= 0;e<c ;e++){
for(int d = 0; d<c ;d++ ){
	a.penDown();
	a.move(180/c);
a.turn(360/c);
}
a.penUp();	
a.move(180);
a.turn(360/c);
}

//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}
