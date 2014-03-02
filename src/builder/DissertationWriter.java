package builder;

public class DissertationWriter {
	private DissertationBuilder dissertationBuilder; 
	
	public DissertationWriter(DissertationBuilder dissertationBuilder){
		this.dissertationBuilder = dissertationBuilder;
		System.out.println("Director Created");
	}
	
	public void printDissertation(){
		dissertationBuilder.buildTitle();
		dissertationBuilder.buildContents();
		dissertationBuilder.buildSummary();
		dissertationBuilder.buildChapters();
		dissertationBuilder.buildReferences();
	}
	
	public Dissertation getDissertation(){
		return dissertationBuilder.getDissertation();
	}
}
