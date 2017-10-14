package com.trd.redingCVS.biz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.trd.redingCVS.vo.ReadingCVSParamBVO;
import com.trd.redingCVS.vo.ReadingCVSResBVO;
import com.trd.redingCVS.vo.ReadingCVSResCVO;

public class ReadingCVSBizImpl  {
	  public List<ReadingCVSResCVO>  getCandleStickReport( ReadingCVSParamBVO candleStickParamBVO ) throws Exception {
		 
			List<ReadingCVSResBVO> LstMngData = new ArrayList<ReadingCVSResBVO>() ;		  
			List<ReadingCVSResBVO> LstCandleStickResBVO = new ArrayList<ReadingCVSResBVO>() ;
			List<ReadingCVSResCVO> LstCandleStickResCVO = new ArrayList<ReadingCVSResCVO>() ;
			LstCandleStickResBVO = getCsvData(candleStickParamBVO) ; 
			LstCandleStickResCVO = mngCsvData(candleStickParamBVO) ; 
			 
			return LstCandleStickResCVO;
 
 	}
	  
	
	  public List<ReadingCVSResBVO>  getCsvData( ReadingCVSParamBVO candleStickParamBVO ) throws Exception {
			 
			List<ReadingCVSResBVO> LstCandleStickResBVO = new ArrayList<ReadingCVSResBVO>() ;
			File csv = new File("C:\\projectPG\\infile\\tradeDataSingle.csv") ; 
			BufferedReader br = new BufferedReader (new FileReader(csv)) ; 
			String line = "" ; 
			int row=0 , i ; 
			ReadingCVSResBVO candleStickResBVO = new ReadingCVSResBVO() ; 
			Timestamp tTemp = null ;
			while ((line = br.readLine() ) != null ) {
				String [] token = line.split(",", -1) ; 
				
				candleStickResBVO.setSeq(row);
				tTemp = new Timestamp(Long.parseLong(token[0])) ; 
				candleStickResBVO.setTimestamp(tTemp);
				candleStickResBVO.setPrice(Integer.parseInt(token[1]));
				candleStickResBVO.setSize(Float.parseFloat(token[2]));
				
				for (i=0; i<3; i++)
				{
					System.out.println( token[i] ) ; 
			 		
				}
				row++ ; 
				candleStickResBVO = null ; 
				LstCandleStickResBVO.add(candleStickResBVO)	; 
			}
			
 
			return LstCandleStickResBVO;
 
 	}	  
	  
	  public List<ReadingCVSResCVO>  mngCsvData( ReadingCVSParamBVO candleStickParamBVO ) throws Exception {
			 
			List<ReadingCVSResCVO> LstCandleStickResCVO = new ArrayList<ReadingCVSResCVO>() ;
			// 날짜 정렬 
			// 30초 단위 loop : 결과세팅
			// List<CandleStickResCVO> 30초 단위 결과 추가 
			
			return LstCandleStickResCVO;
 
 	}	 	  
}
