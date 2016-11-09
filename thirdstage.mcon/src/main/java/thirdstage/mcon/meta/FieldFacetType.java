package thirdstage.mcon.meta;

/**
 * Overall concept of facet is based on the facet of XML schema.
 * Facet is said to be a single defining aspect of a value space.
 * For more, read http://www.w3.org/TR/2004/REC-xmlschema-2-20041028/#facets 
 * 
 * @author 3rdstage
 *
 */
public enum FieldFacetType {
	
	LENGTH,
	MIN_LENGTH,
	MAX_LENGTH,
	PATTERN,
	ENUMERATION,
	MAX, // max inclusive, equal or less than
	MIN, // min inclusive, equal or more than
	MAX_EXCLUSIVE, //less than
	MIN_EXCLUSIVE, //more than

}
