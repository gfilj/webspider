package com.gofoit.webspider.model.list;

import java.util.List;

import com.gofoit.webspider.model.type.SSCTypeEnum;
/**
 * 
 * @author bjluzhangqing
 *
 */
public interface SSCRepoOriginalList {
	
	public List<String> getIssueList() ;

	public void setIssueList(List<String> issueList); 

	public List<String> getNumList() ;

	public void setNumList(List<String> numList) ;
	
	public SSCTypeEnum getType() ;

	public void setType(SSCTypeEnum type);
	
}
