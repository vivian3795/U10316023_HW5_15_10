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
		sample.push("A");
		sample.push("B");
		sample.push("C");
		sample.pop();
		sample.peek();

		//clone it
		MyStack clone = (MyStack)(sample.clone());
		clone.push("A");
		clone.push("B");
		clone.push("C");
		clone.pop();
		clone.peek();		
		
		//let user know the differences 
		System.out.println(sample.getSize()+"\n"+sample.toString());
		System.out.println(clone.getSize()+"\n"+clone.toString());
	}
 }
