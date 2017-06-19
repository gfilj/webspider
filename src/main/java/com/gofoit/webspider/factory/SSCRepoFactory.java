package com.gofoit.webspider.factory;

import java.util.List;

import com.gofoit.webspider.model.SSCRepo;
import com.gofoit.webspider.model.list.SSCRepoOriginalList;

public interface SSCRepoFactory {
	public List<SSCRepo> getSSCRepoList(SSCRepoOriginalList sscRepoOriginalList);
}
