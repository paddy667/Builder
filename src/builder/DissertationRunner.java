package builder;

public class DissertationRunner {
	
	public static void main(String args[]){
		System.out.println("Test Case 1: Printing Project Writeup");
		//Create new ProjectWriteUpBuilder
		DissertationBuilder dissertationBuilder = new ProjectWriteUpBuilder();
		
		DissertationWriter dissertationWriter = new DissertationWriter(dissertationBuilder);
		
		dissertationWriter.printDissertation();
		
		Dissertation dissertation = dissertationWriter.getDissertation();
		
		System.out.println(dissertation);
		
		System.out.println("-----End-----");
		
		System.out.println("Test Case 2: Printing PhD Thesis");
		
		dissertationBuilder = new PhdThesisBuilder();
		
		dissertationWriter = new DissertationWriter(dissertationBuilder);
		
		dissertationWriter.printDissertation();
		
		dissertation = dissertationWriter.getDissertation();
		
		System.out.println(dissertation);
		
		System.out.println("-----End-----");
	}
	
}
