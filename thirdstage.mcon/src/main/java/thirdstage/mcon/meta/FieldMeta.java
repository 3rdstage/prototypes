package thirdstage.mcon.meta;

import java.util.List;
import java.util.Map;

public interface FieldMeta {
	
	public String getName();
	
	public FieldType getType();
	
	public String getDescription();
	
	public List<FieldFacetType> getAppliableFacetTypes();
	
	

}
