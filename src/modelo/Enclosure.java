package modelo;

import org.simpleframework.xml.Attribute;

public class Enclosure {
	@Attribute
	private String url;

	public Enclosure() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enclosure(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Enclosure [url=" + url + "]";
	}
	
	

}
