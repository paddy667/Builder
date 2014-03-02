package builder;

public class ProjectWriteUpBuilder implements DissertationBuilder {
	
	// Initialize a new dissertation
	private Dissertation dissertation;
	
	public ProjectWriteUpBuilder(){
		//Constructor for ProjectWriteUpBuilder
		dissertation = new Dissertation();
		System.out.println("Builder for Project WriteUp Created");
	}

	@Override
	public void buildTitle() {
		// build project title
		dissertation.setTitle("Project Title");
	}

	@Override
	public void buildContents() {
		// build project contents
		dissertation.setContents("Project Chapters");
	}

	@Override
	public void buildSummary() {
		// build project summary
		dissertation.setSummary("Project Summary");
	}

	@Override
	public void buildChapters() {
		// build project chapters
		dissertation.setChapters("Project Chapters");
	}

	@Override
	public void buildReferences() {
		// build project references
		dissertation.setReferences("Project References");
	}
	
	public Dissertation getDissertation(){
		// getter method
		return dissertation;
	}
	
}
