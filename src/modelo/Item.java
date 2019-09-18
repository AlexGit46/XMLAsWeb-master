package modelo;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class Item {
	@Element
	private String title;
	@Element
	private String description;
	@Element
	private String link;
	@ElementList(inline=true, required=false)
	private List<Enclosure> enclosure;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String title, String description, String link, List<Enclosure> enclosure) {
		super();
		this.title = title;
		this.description = description;
		this.link = link;
		this.enclosure = enclosure;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Enclosure> getEnclosure() {
		return enclosure;
	}
	public void setEnclosure(List<Enclosure> enclosure) {
		this.enclosure = enclosure;
	}
	@Override
	public String toString() {
		return "Item [title=" + title + ", description=" + description + ", link=" + link + ", enclosure=" + enclosure
				+ "]";
	}	
}
