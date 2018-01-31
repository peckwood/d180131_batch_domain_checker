package com.raidencentral.d180131_batch_domain_checker;

import java.util.List;

public class DomainData {
	private List<String> domains;
	private List<String> keywords;
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	@Override
	public String toString() {
		return "DomainData [domains=" + domains + ", keywords=" + keywords + "]";
	}
}
