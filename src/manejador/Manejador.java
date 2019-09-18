package manejador;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import modelo.Result;


public class Manejador {
	private Result result;

	public Manejador() {
		String urlTxt = "https://as.com/rss/tags/ultimas_noticias.xml";
		URL url = null;
		try {
			url = new URL(urlTxt);
			InputStream is = url.openStream();
			Serializer serializer = new Persister();
  		    result = serializer.read(Result.class, is, false);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public Result getResult() {
		return result;
	}
}
