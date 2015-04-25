/**
 * ID: U10316023 
 * Ex: 15.10 
 * Information:
 *		A test class to test MyStack class. 
 */
 
 public class test{
	public static void main(String[] args){
		//set a population
		MyStack sample = new MyStack();
		System.out.println("Is sample empty?  " + sample.isEmpty());
		System.out.println("sample's toString is--"+sample.toString());
		System.out.println("push A, B, C"); 
		sample.push("A");
		sample.push("B");
		sample.push("C");
		System.out.println("peek sample--" + sample.peek());
		System.out.println("sample's toString is--"+sample.toString());
		System.out.println("pop it"); 
		sample.pop();
		System.out.println("sample's toString is--"+sample.toString());

		//clone it
		MyStack clone = (MyStack)((MyStack)sample).clone();
		System.out.println("\nIs clone empty? "+ clone.isEmpty());
		System.out.println("clone's toString is--"+clone.toString());
		System.out.println("push A, B, C"); 
		clone.push("A");
		clone.push("B");
		clone.push("C");
		System.out.println("peek clone--" + clone.peek());
		System.out.println("clone's toString is--"+clone.toString());
		System.out.println("pop it"); 
		clone.pop();
		System.out.println("clone's toString is--"+clone.toString());
		
		//let user know the differences 
		System.out.println("\ncompare sample and clone");		
		System.out.println("sample's size is--"+sample.getSize());
		System.out.println("clone's size is--"+clone.getSize());
	}
}
