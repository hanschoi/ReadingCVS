package com.trd.redingCVS.biz;

import java.util.List;

import com.trd.redingCVS.vo.ReadingCVSParamBVO;
import com.trd.redingCVS.vo.ReadingCVSResBVO;

public interface ReadingCVSIBiz {
	
	 
	public List<ReadingCVSResBVO>  getCsvData( ReadingCVSParamBVO candleStickParamBVO ) throws Exception  ;
	public List<ReadingCVSResBVO>  mngCsvData( ReadingCVSParamBVO candleStickParamBVO ) throws Exception  ;
	
	public List<ReadingCVSResBVO>  getCandleStickReport( ReadingCVSParamBVO candleStickParamBVO ) throws Exception  ;
}
