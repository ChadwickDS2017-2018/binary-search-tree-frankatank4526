package implementations;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import structures.BinaryTreeNode;

public class InOrderIterator<T> implements Iterator<T>{

private final Deque<BinaryTreeNode<T>> stack; 
BinaryTreeNode<T> toReturn;
BinaryTreeNode<T> currentRoot;
BinaryTreeNode<T> toReturn2;
BinaryTreeNode<T> toVisit2;
BinaryTreeNode<T> toVisit3;
private int count = 0;
boolean firstRun = true;
boolean firstRun2 = true;
	public InOrderIterator(BinaryTreeNode<T> root){
		toReturn = root.getLeftChild();
		currentRoot = root;
		stack = new LinkedList<BinaryTreeNode<T>>();
		stack.push(findLeftMostChild());
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public T next() {
		BinaryTreeNode<T> toVisit = stack.pop();
		//if(toVisit.hasLeftChild()) stack.push(findLeftMostChild());
		if(toVisit.hasLeftChild() == false && count == 0){
			stack.push(findLeftMostChild());
		}
		System.out.println(count);
		if(toVisit.hasLeftChild() == false && toVisit.hasRightChild() == false && count == 1){
			
			BinaryTreeNode<T> replacement = (findNextFather(toVisit));
			System.out.println(replacement.getData() + "replacement");
			stack.push(replacement);
			System.out.println(stack.size() + "this is size");
			System.out.println(toVisit.getData() + "toVisit");
			if(replacement.getData() == toVisit.getData()){
		//	return (T) replacement.getData();
			}
		}
	//	if(toVisit.hasRightChild()) stack.push(toVisit.getRightChild());
		if(toVisit.hasRightChild() == true && count == 1){
			//System.out.println("its reaching here");
			BinaryTreeNode<T> goDown;
			goDown = toVisit.getRightChild();
			if(goDown.hasLeftChild() == true){
				BinaryTreeNode<T> furthestDown;
				furthestDown = goFarLeft(goDown);
				System.out.println(furthestDown.getData() + "furthestDown");
				return (T) furthestDown.getData();
			}
			
			
		}
		count = 1;
		return toVisit.getData();
	}
	
public BinaryTreeNode<T> goFarLeft(BinaryTreeNode<T> leftKid){
	while(leftKid.getLeftChild() != null){
		leftKid = leftKid.getLeftChild();
	}
	return leftKid;
}
public BinaryTreeNode<T> findLeftMostChild(){
	BinaryTreeNode<T> scrollNode;
	scrollNode = currentRoot.getLeftChild();
	while(scrollNode.hasLeftChild() == true){
		scrollNode = scrollNode.getLeftChild();
	}
	return scrollNode;
	
	
	
}
public BinaryTreeNode<T> findNextFather(BinaryTreeNode<T> kiddo){
	BinaryTreeNode<T>matchThis = currentRoot;
	while(matchThis.getLeftChild().getData() != kiddo.getData()){
		matchThis = matchThis.getLeftChild();
	}
	System.out.println(matchThis.getData()+ "matchthis");
	return matchThis;
}
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
