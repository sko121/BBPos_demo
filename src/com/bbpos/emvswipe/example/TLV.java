package com.bbpos.emvswipe.example;

import java.util.List;

public class TLV {
	
	public String tag;
	public String length;
	public String value;
	
	public boolean isNested;
	public List<TLV> tlvList;
	
}
