package com.trd.redingCVS.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.trd.redingCVS.biz.ReadingCVSBizImpl;
import com.trd.redingCVS.vo.ReadingCVSParamBVO;
import com.trd.redingCVS.vo.ReadingCVSResBVO;

public class readingCVSTest {

  
 
	@Test
	public void test() throws Exception {
		ReadingCVSBizImpl candleStickIBiz = new ReadingCVSBizImpl () ; 
		ReadingCVSParamBVO candleStickParamBVO = new ReadingCVSParamBVO() ; 
		List<ReadingCVSResBVO> lstCandleStickResBVO = new ArrayList<ReadingCVSResBVO>() ;
		 
		lstCandleStickResBVO = candleStickIBiz.getCsvData(candleStickParamBVO) ; 
	 
		System.out.println("----1 CDMB_MngBIZ_Test.listcards------ ");
		 
	}

	 
}
