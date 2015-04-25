/**
 * ID: U10316023 
 * Ex: 15.10 
 * Information:
 *		MyStack class was on page 462. 
 *	 Rewrite MyStack to perform a deep copy.
 */

import java.util.ArrayList;

//define MyStack that implements the Cloneable interface
class MyStack implements Cloneable {
	// the codes under this line were listed on page 462 
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
  }

	public Object peek() {
		return list.get(getSize() - 1);
  }

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
	
	//supperess warning
	@SuppressWarnings(value={"unchecked", "deprecation"})
	//this exception is thrown if MyStack does not implement Cloneable
	public Object Clone() throws CloneNotSupportedException{
		//perform a shallow copy
		MyStack mystack_clone = (MyStack)super.clone();
		//deep copy on list
		mystack_clone.list = (ArrayList<Object>)this.list.clone();
		return mystack_clone;
	}

}
