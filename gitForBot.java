package hackathon;
import javax.swing.*;
import javax.xml.ws.Response;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class guiForBot extends JFrame {

    static TextField user = new TextField();
    TextField response = new TextField();
    
    public static int AI = 0;
    public String new1="";
    public String new2="";
    public static  String c="";


    public guiForBot(int w, int h){
    	hackathon app2 = new hackathon();
        File file = new File("input.txt");
    	String b = file.getAbsolutePath();
    	File file2 = new File("response.txt");
    	String a = file2.getAbsolutePath();
    	app2.get1(a,b);
    	
    	
        this.setTitle("Suicide help bot");
        user.setBackground(Color.BLACK);
        response.setBackground(Color.PINK);
        user.setForeground(Color.WHITE);
        response.setForeground(Color.BLACK);
        this.setLayout(new GridLayout(2,1));
        this.getContentPane().add(user);
        this.getContentPane().add(response);
        this.setSize(w,h);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      response.setText("How can i help?");
        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	response.setText("");
               String aa = user.getText();
               String bb ="";
     if(AI ==0) 
               bb = app2.Response(aa);
               
               response.setText(bb);
          
             if (bb.equals("idk how do you want me to respond to that?"))
             {
            	 user.setText("");
            	 c = aa;
            	 AI = 1;}
            	 
            	 
             else  if(AI == 1) {
               	 app2.adding(c, aa);
               	 user.setText("");
               	 response.setText("Thanks");
               	 AI=0;
                    }
            	
            	  
                 
                  
                  
                  
            	  
      
             else if (bb.equals("Frank: goodbye"))
             {
            	 app2.write(b, a);
            	 response.setText("For more help call 1-800-273-8255");
            	 user.setText("For more help call 1-800-273-8255");
				
            	
					
             }
             else {
            	 response.setText(bb);
                 user.setText("");
            	 
             }
               
           
               
               
            }
        } );



    }


    public static void main(String[] args) {
        guiForBot go = new guiForBot(600,600);
    }


    
}
