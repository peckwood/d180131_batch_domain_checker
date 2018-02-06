package com.raidencentral.d180131_batch_domain_checker;

import java.util.Set;

public class DomainData {
	private Set<String> domains;
	private Set<String> keywords;
	@Override
	public String toString() {
		return "DomainData [domains=" + domains + ", keywords=" + keywords + "]";
	}
	
	public Set<String> getDomains() {
		return domains;
	}
	public void setDomains(Set<String> domains) {
		this.domains = domains;
	}
	public Set<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(Set<String> keywords) {
		this.keywords = keywords;
	}
	
}
