
package hackathon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hackathon {
	public static Scanner scanny = new Scanner(System.in);
	public static ArrayList<String> Ethan = new ArrayList<String>();
	public static ArrayList<String> Ethan2 = new ArrayList<String>();
	public static int index;
	public static String a ="";
	public static String b ="";
	

	public static void write(String file, String file2) {

		

			BufferedWriter bw = null;
			FileWriter fw = null;
			BufferedWriter bw2 = null;
			FileWriter fw2 = null;
			try {

				

				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				for(int i =0; i < Ethan.size(); i++) {
					if(i==0)
						bw.write(Ethan.get(i));
					else
				bw.write("\n"+Ethan.get(i));
				
				}
				fw2 = new FileWriter(file2);
				bw2 = new BufferedWriter(fw2);
				for(int i =0; i < Ethan2.size(); i++) {
					
					if(i==0)
						bw2.write(Ethan2.get(i));
					else
				bw2.write("\n"+Ethan2.get(i));
			
				}

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();
					
					if (bw2 != null)
						bw2.close();

					if (fw2 != null)
						fw2.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}}
	public static String getGreeting() {
		return "Frank: Hello";
	}
	public static void get1(String input, String ending) {
		try {
		
        File f2 = new File(ending); 

        BufferedReader b2 = new BufferedReader(
        		new FileReader(f2));

        String readLine2 = "";

       
        
        while ((readLine2 = b2.readLine()) != null) {
        Ethan.add(readLine2);
        }
            
        

   
        File f = new File(input);

        BufferedReader b = new BufferedReader(new FileReader(f));

        String readLine = "";

   
        while ((readLine = b.readLine()) != null) {
        Ethan2.add(readLine);
            
        }
		}
		catch (IOException e) {
            e.printStackTrace();
        }
	}

	
		

		
	
public static void adding (String add1, String add2) {
	Ethan.add(add1);
	Ethan2.add(add2);
}
	public static String Response(String user) {

		index = -1;
		String aa = "Frank: ";
		int a = 0;
		for (int i = 0; i < Ethan.size(); i++) {// loop going through each thing in the array
			a = Ethan.get(i).length();

			for (int iii = 0; iii <= user.length() - a; iii++) {// loop checking at each index of the in put string

				if (iii + a <= user.length()) {
					if (Ethan.get(i).equalsIgnoreCase(user.substring(iii, iii + a))) {// seeing if the array index is equal to the input

						if ((iii == 0 || user.substring(iii - 1, iii).equals(" "))//checking if the frount of the word has whitespace or starts the input string
								&& (iii + a == user.length() || user.substring(iii + a, iii + a + 1).equals(" "))) {// checking if the end of the word ends the string or has whitespace after it

							index = i;
							break;
						}
					}
				}
			}
			

		}

		if (user.length() == 0) { // if they type nothing clause
			aa = aa + "Say something";
			return aa;
		} else if (index == -1) {// Ai clause
			return("idk how do you want me to respond to that?");
			

			
			

			
		} else if (index == 16) {// the like clause
			String hhh = user.substring(user.length() - 3, user.length());
			aa = aa + "Why do you " + user.substring(2);
			return aa;

		} else if (index == 15) {// the want clause
			aa = aa + Ethan2.get(index) + user.substring(7);

			return aa;
		}
		else {// no special clause clause
			aa = aa + Ethan2.get(index);
		}

		return aa;

	}
	
}
