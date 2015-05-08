package com.jokerstation.base.dao;

import com.joker23.orm.persistence.POJO;
import com.jokerstation.base.data.BaseData;

/**
 * 被继承的dao类
 * @author Joker
 *
 * @param <T>
 */
public class BaseDao<T extends POJO> extends com.joker23.orm.dao.BaseDao<T> {
	
	public BaseDao(Class<T> beanClass) {
		super(beanClass, BaseData.alias);
	}
	
}
