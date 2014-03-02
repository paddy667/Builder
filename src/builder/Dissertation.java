package builder;

public class Dissertation {
	private String title;
	private String contents;
	private String summary;
	private String chapters;
	private String referneces;
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setContents(String contents){
		this.contents = contents;
	}
	
	public void setSummary(String summary){
		this.summary = summary; 
	}
	
	public void setChapters(String chapters){
		this.chapters = chapters;
	}
	
	public void setReferences(String references){
		this.referneces = references;
	}
	
	public String toString(){
		return title +'\n' + contents + '\n' + summary + '\n' + chapters + '\n' + referneces;
	}
}
