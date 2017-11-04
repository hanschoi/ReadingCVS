package net.joy.cd.mb.biz;

import java.util.List;


import net.joy.cd.mb.vo.*;  


public interface CDMB_MngIBIZ {
	
	
	public String getMemberInfo (String strUid )  throws Exception ; 
	public List<ListCardsResBVO>  getLstCardMap( GetLstCardMapReqBVO getLstCardMapReqBVO) throws Exception  ;	
			   
}
