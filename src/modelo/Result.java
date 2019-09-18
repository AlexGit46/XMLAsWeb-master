package modelo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
@Root(name="rss")
public class Result {
	@Element
	private Channel channel;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(Channel channel) {
		super();
		this.channel = channel;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "Result [channel=" + channel + "]";
	}
	

}