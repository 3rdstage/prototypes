package thirdstage.mcon.meta;

import java.util.Map;

import javax.validation.constraints.NotNull;

public interface MessageMeta {
	
	@NotNull
	public String getId();
	
	public String getVersion();
	
	public Map<String, MessageHeadersMeta> getHeadersMetas();
	
	public MessageBodyMeta getBodyMeta();

}
