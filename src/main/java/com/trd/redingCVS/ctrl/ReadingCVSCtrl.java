package com.trd.redingCVS.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;

import com.trd.redingCVS.biz.ReadingCVSBizImpl;
import com.trd.redingCVS.vo.ReadingCVSParamBVO;
import com.trd.redingCVS.vo.ReadingCVSResBVO;
import com.trd.redingCVS.vo.ReadingCVSResCVO;



public class ReadingCVSCtrl {
	
	@Inject
	private ReadingCVSBizImpl candleStickBizImpl ; 
	
	
	@RequestMapping("/getCandleStickReport")
	public  List<ReadingCVSResCVO> getCandleStickReport () throws Exception
	 { 
		ReadingCVSParamBVO candleStickParamBVO = new ReadingCVSParamBVO() ; 
		List<ReadingCVSResCVO> lstCandleStickResCVO = new ArrayList<ReadingCVSResCVO>() ;
		ReadingCVSBizImpl candleStickBizImpl = new ReadingCVSBizImpl() ; 
		lstCandleStickResCVO = candleStickBizImpl.getCandleStickReport(candleStickParamBVO) ; 
		 
		return lstCandleStickResCVO ; 
	}
}
