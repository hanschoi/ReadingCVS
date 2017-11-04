package com.smpl.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.joy.cd.mb.biz.CDMB_MngIBIZ;
import net.joy.cd.mb.vo.GetLstCardMapReqBVO;
import net.joy.cd.mb.vo.ListCardsResBVO;
import net.joy.cd.ut.GeneralAPIResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class CDMB_MngCTR_old {
	
	  @Inject
	  CDMB_MngIBIZ cdmb_MngBIZ  ;	
	

	@RequestMapping(value="/getLstCardMap_old" , method = RequestMethod.POST, produces = "application/json")
	public GeneralAPIResponse getLstCardMap(GetLstCardMapReqBVO listCardsReqBVO, GeneralAPIResponse response,
				HttpServletRequest request, HttpSession session) throws Exception{ 

		List<ListCardsResBVO> ListCardsResBVOLst = new ArrayList() ; 
 
		try {
		  	ListCardsResBVOLst = cdmb_MngBIZ.getLstCardMap(listCardsReqBVO ) ; 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		response.setResult(ListCardsResBVOLst) ; 
		
		return response;
		
	}

 
	
}