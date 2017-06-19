package com.gofoit.webspider.model.builder;

import com.gofoit.webspider.model.SSCRepo;

public class SSCRepoBuilder {
	
	private SSCRepo sscRepo = new SSCRepo();
	
	public SSCRepoBuilder setIssue(String issue) {
		sscRepo.setIssue(issue);
		return this;
	}
	public SSCRepoBuilder setDigit5(int digit5) {
		sscRepo.setDigit5(digit5);
		return this;
	}
	public SSCRepoBuilder setDigit4(int digit4) {
		sscRepo.setDigit4(digit4);
		return this;
	}
	public SSCRepoBuilder setDigit3(int digit3) {
		sscRepo.setDigit3(digit3);
		return this;
	}
	public SSCRepoBuilder setDigit2(int digit2) {
		sscRepo.setDigit2(digit2);
		return this;
	}
	public SSCRepoBuilder setDigit1(int digit1) {
		sscRepo.setDigit1(digit1);
		return this;
	}
	
	public static SSCRepoBuilder getInstance(){
		return new SSCRepoBuilder();
	}
	
	public SSCRepo build(){
		return sscRepo;
	}
}
