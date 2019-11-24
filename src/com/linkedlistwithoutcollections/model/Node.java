package com.linkedlistwithoutcollections.model;

public class Node {
	private Node nextNode;
	private Object data;
	
	public Node(Object data)
	{
		this.data = data;
		this.nextNode = null;
	}
	
	public Node showNextNode()
	{
		return nextNode;
	}
	
	public void addNext(Node node)
	{
		this.nextNode = node;
	}
	
	public Object showNodeData()
	{
		return data;
	}
}
