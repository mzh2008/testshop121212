package net.shopxx.dao.impl;

import net.shopxx.dao.OrderLogDao;
import net.shopxx.entity.OrderLog;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 订单日志
 */

@Repository
public class OrderLogDaoImpl extends BaseDaoImpl<OrderLog, String> implements OrderLogDao {
	
}