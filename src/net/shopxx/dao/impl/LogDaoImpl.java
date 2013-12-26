package net.shopxx.dao.impl;

import net.shopxx.dao.LogDao;
import net.shopxx.entity.Log;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 日志
 */

@Repository
public class LogDaoImpl extends BaseDaoImpl<Log, String> implements LogDao {

}
