package net.shopxx.service.impl;

import javax.annotation.Resource;

import net.shopxx.dao.BrandDao;
import net.shopxx.entity.Brand;
import net.shopxx.service.BrandService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 品牌
 */

@Service
public class BrandServiceImpl extends BaseServiceImpl<Brand, String> implements BrandService {

	@Resource
	public void setBaseDao(BrandDao brandDao) {
		super.setBaseDao(brandDao);
	}

}