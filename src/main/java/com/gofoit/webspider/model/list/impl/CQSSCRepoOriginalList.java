package com.gofoit.webspider.model.list.impl;

import java.util.List;

import com.gofoit.webspider.factory.impl.CQSSCRepoFactory;
import com.gofoit.webspider.model.list.SSCRepoOriginalList;
import com.gofoit.webspider.pipeline.SSCPageModelPipeline;

import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * 重庆六合彩
 * 
 * @author luchangqing
 *
 */
@TargetUrl("http://www.cqcp.net/game/ssc/")
public class CQSSCRepoOriginalList implements SSCRepoOriginalList{
	@ExtractBy("//div[@id='openlist']/ul/li[@style='width:65px;']/text()")
	private List<String> issueList;
	@ExtractBy("//div[@id='openlist']/ul/li[@style='width:80px;']/text()")
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
		sscPageModelPipeline.setSscRepoFactory(new CQSSCRepoFactory());
		 OOSpider.create(Site.me(), sscPageModelPipeline, CQSSCRepoOriginalList.class)
	        .addUrl("http://www.cqcp.net/game/ssc/")
	        .thread(1)
	        .run();
    }
}
