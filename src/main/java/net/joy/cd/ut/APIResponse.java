package net.joy.cd.ut;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class APIResponse extends APIUsage {
	/**
	 * 
	 */
	private static final long serialVersionUID = -323957158654929536L;
	
	private String nonce;
	
	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
}
