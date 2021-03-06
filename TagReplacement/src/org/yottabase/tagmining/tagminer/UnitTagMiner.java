package org.yottabase.tagmining.tagminer;

public class UnitTagMiner extends RegexTagMiner {
	
	private final String TAG_NAME = "UNIT";

	private final String UNITS = "unit";
	
	private final String regexTemplate = "\\b(\\d+[\\.|,]\\d+|\\d+)(([ ]?)+(%s)\\b)";
	
	public UnitTagMiner() {
		super();
		
		String values = (super.properties.get(UNITS)).replaceAll(",", "|");
		super.setTag(TAG_NAME);
		super.setRegex(String.format(this.regexTemplate, values));
		
	}

}