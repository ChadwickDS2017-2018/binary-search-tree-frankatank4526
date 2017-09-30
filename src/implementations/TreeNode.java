package implementations;

import structures.BinaryTreeNode;

public class TreeNode<T> implements BinaryTreeNode<T> 
{
private TreeNode<T> left;
private TreeNode<T> right;
private int height;
private int maxIndex;

public TreeNode(){
	super();
	height = 0;
	maxIndex = 0;
}
public TreeNode(T elem){
	super(elem);
	height = 1;
	maxIndex = 0;
}
	@Override
	public T getData()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setData(Object data)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasLeftChild()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRightChild()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BinaryTreeNode getLeftChild()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryTreeNode getRightChild()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeftChild(BinaryTreeNode left)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRightChild(BinaryTreeNode right)
	{
		// TODO Auto-generated method stub
		
	}

}
