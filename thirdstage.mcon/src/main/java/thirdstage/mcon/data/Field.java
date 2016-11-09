package thirdstage.mcon.data;

import thirdstage.mcon.meta.FieldMeta;

public interface Field<T> {

	public String getName();
	
	public T getValue();

}
