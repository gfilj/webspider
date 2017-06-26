package com.goforit.gamestrategy.prize;

import com.gofoit.webspider.model.SSCRepo;
import com.goforit.gamestrategy.ssctype.CathecticType;
import com.goforit.gamestrategy.ssctype.ShadeType;

/**
 * 时时彩中奖
 * @author mac
 *
 */
public interface SSCWinPrize {
	boolean isWinPrize(SSCRepo sscRepo, ShadeType shadeType, CathecticType cathecticType);
}
