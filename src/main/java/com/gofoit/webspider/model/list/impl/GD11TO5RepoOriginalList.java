package com.gofoit.webspider.model.list.impl;

import java.util.List;

import com.gofoit.webspider.factory.impl.TJSSCRepoFactory;
import com.gofoit.webspider.model.list.SSCRepoOriginalList;
import com.gofoit.webspider.pipeline.SSCPageModelPipeline;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * 重庆六合彩
 * 
 * @author luchangqing
 *
 */
@TargetUrl("http://baidu.lecai.com/lottery/draw/list/23")
public class GD11TO5RepoOriginalList implements SSCRepoOriginalList{
	@ExtractBy("//table[@id='draw_list']/tbody/tr/td/regex('\\d{8}')")
	private List<String> issueList;
	@ExtractBy("//table[@id='draw_list']/tbody/tr/td/span/span/regex('\\d{2}')")
	private List<String> numList;
	
	public List<String> getIssueList() {
		return issueList;
	}

	public void setIssueList(List<String> issueList) {
		this.issueList = issueList;
	}

	public List<String> getNumList() {
		return numList;
	}

	public void setNumList(List<String> numList) {
		this.numList = numList;
	}
	
	public static void main(String[] args) {
		SSCPageModelPipeline sscPageModelPipeline = new SSCPageModelPipeline();
		sscPageModelPipeline.setSscRepoFactory(new TJSSCRepoFactory());
		 OOSpider.create(Site.me(), sscPageModelPipeline, GD11TO5RepoOriginalList.class)
	        .addUrl("http://baidu.lecai.com/lottery/draw/list/23")
	        .thread(1)
	        .run();
    }

	
}
