package cn.it.shop.dao;

import java.math.BigDecimal;

import cn.it.shop.model.Forder;

public interface ForderDao extends BaseDao<Forder> {
	//���ݶ�����ţ����¶���״̬
	public void updateStatusById(int id, int sid);
}
