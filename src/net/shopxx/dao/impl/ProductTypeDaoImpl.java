package net.shopxx.dao.impl;

import java.util.Set;

import net.shopxx.dao.ProductTypeDao;
import net.shopxx.entity.Product;
import net.shopxx.entity.ProductType;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 商品类型
 */

@Repository
public class ProductTypeDaoImpl extends BaseDaoImpl<ProductType, String> implements ProductTypeDao {

	// 关联处理
	@Override
	public void delete(ProductType productType) {
		Set<Product> productSet = productType.getProductSet();
		for (Product product : productSet) {
			product.setProductType(null);
			product.setProductAttributeMap(null);
		}
		super.delete(productType);
	}

	// 关联处理
	@Override
	public void delete(String id) {
		ProductType productType = super.load(id);
		this.delete(productType);
	}

	// 关联处理
	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			ProductType productType = super.load(id);
			this.delete(productType);
		}
	}

}