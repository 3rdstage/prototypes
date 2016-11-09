package thirdstage.mcon;

import thirdstage.mcon.data.Field;
import thirdstage.mcon.meta.MessageMeta;

public interface Message {
	
	
	public MessageMeta getMeta();
	
	/**
	 * If the message has multiple headers, return the most basic or common, 
	 * in other words default headers of this message.
	 * 
	 * @return
	 */
	public MessageHeaders getBasicHeaders();
	
	public MessageHeaders getHeaders(String name);
	
	public Field getHeadersField(String headersName, String fieldName);
	
}
