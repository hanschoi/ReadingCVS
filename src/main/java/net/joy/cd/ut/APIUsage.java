package net.joy.cd.ut;

import java.io.IOException;
import java.io.Serializable;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class APIUsage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6494148291215693724L;

	@JsonInclude(value = Include.NON_DEFAULT)
	boolean isE2e;

	public boolean isE2e() {
		return isE2e;
	}

	public void setE2e(boolean isE2e) {
		this.isE2e = isE2e;
	}

	public String toString() {

		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

		String json = this.getClass().toString();

		try {
			json = ow.writeValueAsString(this);
		} catch (IOException e) {
			//;
		}

		return json;
	}
}
