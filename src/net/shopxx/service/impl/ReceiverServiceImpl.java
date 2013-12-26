package net.shopxx.service.impl;

import javax.annotation.Resource;

import net.shopxx.dao.ReceiverDao;
import net.shopxx.entity.Receiver;
import net.shopxx.service.ReceiverService;

import org.springframework.stereotype.Service;

/**
 * Service实现类 - 收货地址
 */

@Service
public class ReceiverServiceImpl extends BaseServiceImpl<Receiver, String> implements ReceiverService {

	@Resource
	public void setBaseDao(ReceiverDao receiverDao) {
		super.setBaseDao(receiverDao);
	}

}