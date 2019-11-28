package com.linkedlistwithoutcollections.app;


import java.util.Scanner;

import com.linkedlistwithoutcollections.model.LinkedListNodes;

/*
 * @autor Jonas Maldonado
 * */

public class LinkedListWC {
	
	public static void main(String[] args) 
	{
		//objects initialization
		String option = "y";
		Scanner input = new Scanner(System.in);
		
		//variables declaration
		int optionNumber = 0;
		int index = 0;
		
		//process to create the menu
		do 
		{
			System.out.println("Press any letter to continue and 'e' to exit the program");
			
			//get the option of being in the program
			option = input.next();
			
			
			if(option.equals("e"))
			{
				option = "e";
				break;
			}
			else
			{
				//Menu to manipulate the linked list with nodes
				System.out.println("********Options************");
				System.out.println("To add element to the list press:  [1]");
				System.out.println("To show element of the list press: [2]");
				System.out.println("To show all the list press: 	   [3]");
				System.out.println("To show the list size press:       [4]");
				
				//get the user option
				optionNumber = input.nextInt();
				
				switch(optionNumber)
				{
				    case 1: 
				    	System.out.println("Input data to the element:");
				    	input.nextLine();
				    	LinkedListNodes.addNextNode(input.next());
				    	System.out.println("Saved!");
				    	break;
				    case 2:
				    	System.out.println("Input the index of the element:");
				    	index = input.nextInt();
				    	if(LinkedListNodes.showDataAtIndex(index) == null)
				    	{
				    		System.out.println("That node does not exist!");
				    	}
				    	else
				    	{
				    		System.out.println("The data of element: ["+index+"] is ["+ LinkedListNodes.showDataAtIndex(index)+"]");
				    	}
				    	
				    	break;
				    case 3:
				    	System.out.println("Elements of the list:");
				    	LinkedListNodes.showAll();
				    	break;
				    case 4:
				    	System.out.println("The list size is:"+LinkedListNodes.getSize());
				    	
				    	break;
				    default:
				    	System.out.println("That option does not exist!");
				    	break;
				    	
				}
			}
			
			
			
		}while(true);
		
	System.out.println("Good bye!");
	input.close();
	}

}
