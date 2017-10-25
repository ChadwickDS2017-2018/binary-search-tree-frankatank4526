package implementations;

import structures.BinaryTreeNode;

public class BinaryTreeMeme<T> implements BinaryTreeNode<T>
{
	protected T element;
	protected BinaryTreeMeme<T> left, right;
//	protected BinaryTreeMeme<T> initialLeft, initialRight, initialRoot;

/**
* Creates a new tree node with the specified data.
*
* @param obj the element that will become a part of the new tree node
*/
	
BinaryTreeMeme (T obj)
{
element = obj;
left = null;
right = null;
}

public BinaryTreeMeme(T initialLeft,T initialRoot, T initialRight){
	element = initialRoot;
	left = (BinaryTreeMeme<T>) initialLeft;
	right = (BinaryTreeMeme<T>) initialRight;
}
/**
* Returns the number of non-null children of this node.
* This method may be able to be written more efficiently.
*
* @return the integer number of non-null children of this node
*/
public int numChildren()
{
int children = 0;
if (left != null)
children = 1 + left.numChildren();
if (right != null)
children = children + 1 + right.numChildren();
return children;
}
@Override
public T getData()
{
	// TODO Auto-generated method stub
	return element;
}

@Override
public void setData(Object data)
{
	// TODO Auto-generated method stub
	element = (T) data;
	
	System.out.println(data);
	System.out.println(element);
}

@Override
public boolean hasLeftChild()
{
	// TODO Auto-generated method stub
	if(left == null)
	return false;
	
	else{
		return true;
	}
}

@Override
public boolean hasRightChild()
{
	// TODO Auto-generated method stub
	if(right == null)
		return false;
		
		else{
			return true;
		}
}

@Override
public BinaryTreeNode getLeftChild()
{
	// TODO Auto-generated method stub
	if(left == null){
		throw new IllegalStateException("noot");
	}
	return left;
	
}

@Override
public BinaryTreeNode getRightChild() 
{
	// TODO Auto-generated method stub
	if(right == null){
		throw new IllegalStateException("noot");
	}
	return right;
}

@Override
public void setLeftChild(BinaryTreeNode leftReplace)
{
	// TODO Auto-generated method stub
	left =  (BinaryTreeMeme<T>) leftReplace;
}

@Override
public void setRightChild(BinaryTreeNode rightReplace)
{
	// TODO Auto-generated method stub
	right =  (BinaryTreeMeme<T>) rightReplace;
}
}