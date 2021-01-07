package api;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown=true)
public class Base {
	
	private long id;
	private String message;
	private String name;
	
	public Base() {
		
	}
	
	public Base(long id, String message, String name) {
		super();
		this.id = id;
		this.message = message;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

