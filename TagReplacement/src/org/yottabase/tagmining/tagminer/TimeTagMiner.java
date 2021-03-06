package org.yottabase.tagmining.tagminer;

public class TimeTagMiner extends RegexTagMiner {

	private static final String TAG_NAME = "TIME";
	
	/*
	 *	23:00:00 	12h:12m:12s		22h 12m 12s		12h12m12s	12h12m12s pm
	 *	05:00	10:27PM	 1:31	20:34pm		20:34 pm	12:59:00PM
	 */
	
	private static final String REGEX_TEMPLATE = "\\b(([0-1]?\\d|2?[0-4])h?)(:|h|h )(([0-5]?\\d)m?)( |:|m)?([0-5]?\\d)s? ?(AM|PM)?\\b";
	
	public TimeTagMiner(){
		
		super(TAG_NAME, REGEX_TEMPLATE);
		
	}
	
}
