package javadrive.swing;

import javax.swing.JFrame;

class Sample1_2{
	public static void main(String args[]){
		JFrame frame = new JFrame("タイトル");
		frame.setBounds(100,100,400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}