package implementations;

import java.util.Iterator;
import structures.BinaryTreeNode;
import structures.BinaryTreeUtility;
import structures.PreOrderIterator;

public class UtilityMemes implements BinaryTreeUtility
{

	@Override
	public <T> Iterator<T> getPreOrderIterator(BinaryTreeNode<T> root)
	{
		// TODO Auto-generated method stub
		return new PreOrderIterator(root);	
	}

	@Override
	public <T> Iterator<T> getInOrderIterator(BinaryTreeNode<T> root)
	{
		// TODO Auto-generated method stub
		return new InOrderIterator(root);
	}

	@Override
	public <T> Iterator<T> getPostOrderIterator(BinaryTreeNode<T> root)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> int getDepth(BinaryTreeNode<T> root)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> boolean isBalanced(BinaryTreeNode<T> root, int tolerance)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T extends Comparable<? super T>> boolean isBST(BinaryTreeNode<T> root)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
