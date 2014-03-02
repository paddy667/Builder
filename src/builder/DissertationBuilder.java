package builder;

public interface DissertationBuilder {

	// build Title
	public void buildTitle();
	// build Contents
	public void buildContents();
	// build project Summary
	public void buildSummary();
	// build Chapters
	public void buildChapters();
	// build References
	public void buildReferences();
	// getter method
	public Dissertation getDissertation();
	
}