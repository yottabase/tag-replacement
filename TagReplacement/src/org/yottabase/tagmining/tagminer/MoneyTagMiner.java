package org.yottabase.tagmining.tagminer;

public class MoneyTagMiner extends RegexTagMiner {
	
	private final String TAG_NAME = "MONEY";

	private final String WORDS = "money.words";
	
	private final String CODES = "money.codes";
	
	private final String SYMBS = "money.symbs";
	
	private final String regexTemplate = "((%s)s?(?:(?![\\n\\r])\\s)*(\\d)+((\\.|,)(\\d)+)?)|(\\d)+((\\.|,)(\\d)+)?(?:(?![\\n\\r])\\s)(%s)s?";
	
	public MoneyTagMiner() {
		super();
		
		String words = super.properties.get(WORDS);
		String codes = super.properties.get(CODES);
		String symbs = super.properties.get(SYMBS);
		String values = (words + "," + codes + "," + symbs).replaceAll(",", "|");
		
		super.setTag(TAG_NAME);
		super.setRegex(String.format(this.regexTemplate, values, values));
		
	}
	
}