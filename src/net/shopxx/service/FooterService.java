package net.shopxx.service;

import net.shopxx.entity.Footer;

/**
 * Service接口 - 页面底部信息
 */

public interface FooterService extends BaseService<Footer, String> {

	/**
	 * 获取Footer
	 * 
	 * @return Footer
	 * 
	 */
	public Footer getFooter();

}