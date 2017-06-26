package com.goforit.gamestrategy.prize.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.gofoit.webspider.model.SSCRepo;
import com.goforit.gamestrategy.prize.SSCWinPrize;
import com.goforit.gamestrategy.shade.SSCGameShade;
import com.goforit.gamestrategy.ssctype.CathecticType;
import com.goforit.gamestrategy.ssctype.ShadeType;

public class GroupStarsSSCWinPrize extends AbstractSSCWinPrize implements SSCWinPrize{
	
	@Autowired
	private SSCGameShade sscGameShade;
	@Override
	public boolean isWinPrize(SSCRepo sscRepo, ShadeType shadeType, CathecticType cathecticType) {
		if(sscGameShade.isWinShade(sscRepo, shadeType)){
			if(isContainAllSSCRepoDigit(sscRepo, cathecticType)){
				return true;
			}
		}
		return false;
	}
	
}
