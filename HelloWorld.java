/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;
/**
 *
 * @author howellx
 */
public class HelloWorld{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     Boolean cont = true;
     ArrayList<hundredt> list = new ArrayList<>();  
     
     HelloWorld.printUserMenu(list,sc);
    
 
}
    
    public static void printUserMenu(ArrayList<hundredt> list, Scanner sc){
	int choice;
	//print a summary of the user account
	//user menu
	do {
                System.out.printf("----------------------------------------------------------------------------------------------------------------- \n");
		System.out.printf("Welcome, what would you like to do?\n");
		System.out.println(" 1) Add User");
		System.out.println(" 2) Remove User");
		System.out.println(" 3) Edit User");
		System.out.println(" 4) Summary");
		System.out.println(" 5) Quit\n");
		System.out.print("Enter choice:\t");
		choice = sc.nextInt();
		
                //read this syntax cause its kinda confusing but it will stop loop(inlcusion) 1-5
		if(choice < 1 || choice > 5) {
			System.out.println("Invalid Choice. Please choose 1-5");
		}
	}while(choice < 1 || choice > 5);
	switch(choice) {
	case 1:
                
		HelloWorld.addMember(list, sc);
		break;
	case 2:
		HelloWorld.removeMember(list,sc);
		break;
	case 3:
		HelloWorld.editMember(list,sc);
		break;
        case 4:
                HelloWorld.Summary(list);
                 break;
	case 5:
		//gobble up rest of previous input
		sc.nextLine();
		break;
	}
	//redisplay menu unless user wants to quit(recursion)
	if(choice != 5) {
		HelloWorld.printUserMenu(list, sc);
	}
	
}   
    
    public static void addMember(ArrayList<hundredt> list, Scanner sc){
        String fir; String last; String pos;
        int salary;
        
        //idk but this fixes the issue of first name being skipped
        sc.nextLine();
        
        System.out.println("What is the member first name?");
        fir= sc.nextLine();
        System.out.println("What is the member last name?");
        last = sc.nextLine();
        System.out.println("What is the member's position?");
        pos = sc.nextLine();
        System.out.println("What is the member's salary?");
        salary =sc.nextInt();

        hundredt append = new hundredt(fir, last, salary, pos);
        
        list.add(append);
}
    
    public static void removeMember(ArrayList<hundredt> list, Scanner sc){
        int removeIndex;
        Summary(list);
        System.out.println("-------------------------------------------------------- ");
        System.out.println("What member would you like to remove? \t ");
       
        removeIndex=sc.nextInt();
        
        list.remove(removeIndex-1); 
    
    }
    
    public static void editMember(ArrayList<hundredt> list, Scanner sc){
        int editIndex;
        int choice;
        String stringchange;
        int numchange;
        
         System.out.println("--------------------------------------------------------------");
        HelloWorld.Summary(list);
        System.out.println("\nWhat member would you like to remove? \t");
        editIndex=sc.nextInt()-1;
        if(editIndex >= list.size()){
            System.out.println("INVALID CHOICE");
            HelloWorld.editMember(list,sc);
        }
        
        
        System.out.printf("Lets Revise Member#%d %s \n",editIndex+1,list.get(editIndex).display());
        do {
		//System.out.printf("Welcome %s what would you like to do?\n", theUSer.getName());
		System.out.println(" 1) Change First Name");
		System.out.println(" 2) Change Last Name");
		System.out.println(" 3) Change Position");
		System.out.println(" 4) Change Salary");
		System.out.println(" 5) Quit\n");
		System.out.print("Enter choice:\t");
		choice = sc.nextInt();
		
		if(choice < 1 || choice > 4) {
			System.out.println("Invalid Choice. Please choose 1-5");
		}
	}while(choice < 1 || choice > 4);
        
        //this is jsut helps so it doesnt skip a line i guess
        sc.nextLine();
        
        switch(choice) {
	case 1:
		System.out.println("Input New First Name");
                stringchange = sc.nextLine();
                list.get(editIndex).setFirstN(stringchange);
		break;
	case 2:
		System.out.println("Input New Last Name");
                stringchange = sc.nextLine();
                list.get(editIndex).setLastN(stringchange);
		break;
	case 3:
		System.out.println("Input New Job Postiion");
                stringchange = sc.nextLine();
                list.get(editIndex).setPostion(stringchange);
		break;
        case 4:
                System.out.println("Input New Salary");
                numchange = sc.nextInt();
                list.get(editIndex).setSalary(numchange);
                break;
	case 5:
		//gobble up rest of previous input
		sc.nextLine();
		break;
	}          
    }
    
    public static void Summary(ArrayList<hundredt> list){
        System.out.println("EMPLOYEE LIST:");
        for(int i = 0; i < list.size();i++){
            System.out.printf("%d ) ",i+1);
            System.out.println(list.get(i).display());
    }
    }
}

   
