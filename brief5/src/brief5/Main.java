package brief5;

import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DaoImp daoimpl = new DaoImp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose One : ");
		System.out.println("1: Save");
	    System.out.println("2: UpDate");
		System.out.println("3: Delete");
	    int operation = sc.nextInt();
	    
	    Scanner inputnom = new Scanner(System.in);
		System.out.print("Enter your last name :  ");
	    String nom = inputnom.nextLine();
	    
	    Scanner inputprenom = new Scanner(System.in);
		System.out.print("Enter your first name:  ");
		String prenom= inputprenom.nextLine();
		
		Scanner inputmail = new Scanner(System.in);
		System.out.print("Enter your mail:  ");
		String mail= inputmail.nextLine();
		
		Scanner inputadress = new Scanner(System.in);
		System.out.print("Enter your adress:  ");
	    String adress= inputadress.nextLine();
		
		Scanner inputville = new Scanner(System.in);
		System.out.print("Enter your city :  ");
		String ville= inputville.nextLine();
		
		Scanner inputpays = new Scanner(System.in);
		System.out.print("Enter your country:  ");
	    String pays= inputpays.nextLine();
	    
	    if(operation==1) {
            Candidats candidat = new Candidats (  nom ,  prenom,  mail,  adress, ville, pays);
  	        System.out.println(daoimpl.save(candidat));
        }else if(operation==2) {
            Candidats Fatiha = new Candidats ( "EL HABTI" ,  "Fatiha",  "elhabtifatiha08@gmail.com",  "123 new york", "michigan", "usa");
       	    System.out.println(daoimpl.update(1, Fatiha));
       	   
        }else if(operation==3) {	
       		daoimpl.delete(6);
       		}
       
          }

}


