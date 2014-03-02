package builder;

public class PhdThesisBuilder implements DissertationBuilder {
	
	// Initialize a new dissertation
	private Dissertation dissertation;
	
	public PhdThesisBuilder(){
		//Constructor for ProjectWriteUpBuilder
		dissertation = new Dissertation();
		System.out.println("Builder for PhD Thesis Created");
	}
	
	@Override
	public void buildTitle() {
		// build PHD title
		dissertation.setTitle("PHD Title");
	}

	@Override
	public void buildContents() {
		// build PHD contents
		dissertation.setContents("PHD Contents");
	}

	@Override
	public void buildSummary() {
		// build PHD Abstract
		dissertation.setSummary("PHD Abstract");
		
	}

	@Override
	public void buildChapters() {
		// build PHD chapters
		dissertation.setChapters("PHD Chapters");
	}

	@Override
	public void buildReferences() {
		// build PHD references
		dissertation.setReferences("PHD References");
	}
	
	public Dissertation getDissertation(){
		// getter method
		return dissertation;
	}

}
