package com.linkedlistwithoutcollections.app;


import java.util.Scanner;

import com.linkedlistwithoutcollections.model.Node;

public class LinkedListWC {
	//global objects
	private Node head;
	//global variables
	private int size;

	//constructor
	public LinkedListWC() {
		head = null;
		size = 0;
	}

	
	public void addNextNode(Object nodeData) {
		if (head == null) 
		{
			head = new Node(nodeData);
		} 
		else
		{
			Node temp = head;
			Node newNode = new Node(nodeData);
			//move trough the nodes until get the last without next node
			while(true)
			{
				
				if(temp.showNextNode() == null)
				{
					temp.addNext(newNode);
					break;
				}
				temp = temp.showNextNode();
			}
			
		}
		size++;
	}

	public Object showDataAtIndex(int index) 
	{
		Node temp = head;
		if(index > size || index < 0)
		{
			return null;
		}
		else
		{
			for (int i = 0; i < index; i++) {
				if(temp.showNextNode() != null)
				temp = temp.showNextNode();
			}
			return temp.showNodeData();
		}
		
	}
	
	public void showAll()
	{
		Node temp = head;		
		for (int i = 0; i < size; i++) 
		{
			
			if(temp == null)
			{
				break;
			}
			else
			{
				System.out.println("Node["+i+"]:["+temp.showNodeData()+"]");
				temp = temp.showNextNode();
			}			
		}
		
	}

	public int getSize() 
	{
		return size;
	}

	public static void main(String[] args) 
	{
		//objects initialization
		LinkedListWC linkedList = new LinkedListWC();
		String option = "y";
		Scanner input = new Scanner(System.in);
		
		//variables declaration
		int optionNumber = 0;
		int index = 0;
		
		//process
		do 
		{
			System.out.println("Press y to continue and n to exit the program");
			option = input.next();
			if(option.equals("n"))
			{
				option = "n";
				break;
			}
			else
			{
				System.out.println("********Options************");
				System.out.println("To add element to the list press:  [1]");
				System.out.println("To show element of the list press: [2]");
				System.out.println("To show all the list press: 	   [3]");
				System.out.println("To show the list size press:       [4]");
				optionNumber = input.nextInt();
				
				switch(optionNumber)
				{
				    case 1:
				    	System.out.println("Input data to the element:");
				    	input.nextLine();
				    	linkedList.addNextNode(input.next());
				    	System.out.println("Saved!");
				    	break;
				    case 2:
				    	System.out.println("Input the index of the element:");
				    	index = input.nextInt();
				    	if(linkedList.showDataAtIndex(index) == null)
				    	{
				    		System.out.println("That node does not exist!");
				    	}
				    	else
				    	{
				    		System.out.println("The data of element: ["+index+"] is ["+ linkedList.showDataAtIndex(index)+"]");
				    	}
				    	
				    	break;
				    case 3:
				    	System.out.println("Elements of the list:");
				    	linkedList.showAll();
				    	break;
				    case 4:
				    	System.out.println("The list size is:"+linkedList.getSize());
				    	
				    	break;
				    default:
				    	System.out.println("That option does not exist!");
				    	break;
				    	
				}
			}
			
			
			
		}while(option.equals("y"));
		
	System.out.println("Good bye!");
	input.close();
	}

}
