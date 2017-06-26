package com.goforit.gamestrategy.shade;

import com.gofoit.webspider.model.SSCRepo;
import com.goforit.gamestrategy.ssctype.ShadeType;

/**
 * 时时彩中奖形态
 * @author mac
 *
 */
public interface SSCGameShade {
	/**
	 * 是否为中奖形态
	 * @return
	 */
	boolean isWinShade(SSCRepo sscRepo, ShadeType shadeType);
}
