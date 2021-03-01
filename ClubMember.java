package softwareDev;

public class ClubMember {
	
	private String name;
	private String location;
	private String language;
	
	public ClubMember() {
		this.name = "";
		this.location = "";
		this.language = "";
	}
	
	public ClubMember(String name, String location, String language) {
		this.name = name;
		this.location = location;
		this.language = language;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getLanguage() {
		return this.language;
	}
}
