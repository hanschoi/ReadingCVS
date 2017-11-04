package net.joy.cd.mb.ctr;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CDMB_MngCTR {
	private static final Logger logger = 
			LoggerFactory.getLogger(CDMB_MngCTR.class);
	
  @Inject
 private CDMB_MngIBIZ cdmb_MngBIZ  ;
  
 
	@RequestMapping(value="/getLstCardMap" , method = RequestMethod.POST, produces = "application/json")
	public GeneralAPIResponse getLstCardMap(GetLstCardMapReqBVO listCardsReqBVO, GeneralAPIResponse response,
				HttpServletRequest request, HttpSession session) throws Exception{ 

		logger.warn("strUid: " + listCardsReqBVO.getDstMemGuid());
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