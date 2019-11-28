package com.linkedlistwithoutcollections.model;

public class LinkedListNodes {
	//global variables of the list
	private static Node head;
	
	private static int size;


	
	public static void addNextNode(Object nodeData) {
		if (head == null)  //there is no nodes in the list
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
		size++; //make the list bigger 
	}

	public static Object showDataAtIndex(int index) 
	{
		Node temp = head;
		
		//if the user does not put a correct index
		if(index > size || index < 0)
		{
			return null;
		}
		else
		{
			for (int i = 0; i < index; i++) 
			{
				//iterate in the list until get the number of the node
				if(temp.showNextNode() != null)
				   temp = temp.showNextNode();
			}
			return temp.showNodeData();
		}
		
	}
	
	public static void showAll()
	{
		Node temp = head;
		//print all the nodes in the list using the size of the list
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

	public static int getSize() 
	{
		return size;
	}

}
