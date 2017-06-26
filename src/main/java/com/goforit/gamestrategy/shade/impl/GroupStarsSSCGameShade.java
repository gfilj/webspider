package com.goforit.gamestrategy.shade.impl;

import com.gofoit.webspider.model.SSCRepo;
import com.goforit.gamestrategy.shade.SSCGameShade;
import com.goforit.gamestrategy.ssctype.ShadeType;

public class GroupStarsSSCGameShade extends AbstractSSCGameShade implements SSCGameShade{
	
	
	@Override
	public 	boolean isWinShade(SSCRepo sscRepo, ShadeType shadeType) {
		if(super.getEqualGroupNum(sscRepo)==shadeType.getEqualGroupNum()){
			return true;
		}
		return false;
	}
	
	

}
