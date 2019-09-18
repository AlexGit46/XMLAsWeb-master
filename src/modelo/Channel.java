package modelo;

import java.util.List;

import org.simpleframework.xml.ElementList;

public class Channel {
	@ElementList(inline=true, name="item")
	private List<Item> items;

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Channel(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Channel [items=" + items + "]";
	}
	
}
