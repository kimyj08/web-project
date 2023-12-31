package com.springproj.biz.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.biz.dao.AskDAOMybatis;
import com.springproj.biz.domain.AskVO;
import com.springproj.biz.service.AskService;

@Service("askService")
public class AskServiceImpl implements AskService {

	@Autowired
	private AskDAOMybatis dao;
	
	@Override
	public void insertServiceB(AskVO vo) {
		dao.insertBAsk(vo);
	}

	@Override
	public void insertServiceU(AskVO vo) {
		dao.insertUAsk(vo);
	}
	
	@Override
	public void insertServiceP(AskVO vo) {
		dao.insertUAskP(vo);
	}

	@Override
	public AskVO getService(AskVO vo) {
		AskVO ask = dao.getAsk(vo);
		return ask;
	}

	@Override
	public List<AskVO> getServiceBList(AskVO vo) {
		return dao.getBAskList(vo);
	}
	
	@Override
	public List<AskVO> getServiceUList(AskVO vo) {
		return dao.getUAskList(vo);
	}
	
	@Override
	public List<AskVO> getServicePList(AskVO vo) {
		return dao.getPAskList(vo);
	}

	@Override
	public void updateService(AskVO vo) {
		dao.updateAsk(vo);
	}
	
	@Override
	public void updateCntService(int a_no) {
		dao.updateCnt(a_no);
	}

	@Override
	public void deleteService(int a_no) {
		dao.deleteAsk(a_no);
	}

	@Override
	public List<Map<String, String>> getBrandList() {
		return dao.getBrandList();
	}

	
}
