package thirdstage.mcon.meta;

import java.util.Map;

public interface MessageHeadersMeta {
	
	public Map<String, FieldMeta> getHeaderMetas();
	
	public FieldMeta getHeaderMeta(String name);

	/**
	 * Add a header meta using it's name as a key.
	 * 
	 * @param meta to add
	 * @return <code>this</code> object.
	 * @throws IllegalArgumentException if the given <code>meta</code>
	 *     or the name of the <code>meta</code> object is <code>null</code>.
	 */
	public MessageHeadersMeta putHeaderMeta(FieldMeta meta);
	
	
	
}
