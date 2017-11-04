package net.joy.cd.mb.biz;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import net.joy.cd.mb.dao.CDMB_MngQDAO;
import net.joy.cd.mb.vo.GetLstCardMapReqBVO;
import net.joy.cd.mb.vo.ListCardsResBVO;
  
@Service
public class CDMB_MngBIZ implements CDMB_MngIBIZ  {
	

	@Autowired
	CDMB_MngQDAO dao;
  
	
	/**
	 * getMemberInfo
	 * @throws Exception 
	 */
	public String getMemberInfo( String strUid ) throws Exception {
		String resultStr = "";
 
		   System.out.println("in getMemberInfo : ");
		   resultStr = dao.getTime() ; 

		//	MemberBVO vo = new MemberBVO();
		//	vo = dao.readMember("user04") ; 
		 	System.out.println("resultStr: " + resultStr);					
		
		return resultStr;
	}
	
  
	/**
	 * getLstCardMap
	 * @throws Exception 
	 */
	public List<ListCardsResBVO>  getLstCardMap( GetLstCardMapReqBVO getLstCardMapReqBVO) throws Exception {
		String resultStr = "";
		List<ListCardsResBVO> listCardsResBVOLst = new ArrayList<ListCardsResBVO>() ;  
		// ListCardsReqLVO listCardsReqLVO = new ListCardsReqLVO();
		
		// listCardsReqLVO.setUid(getLstCardMapReqBVO.getDstMemGuid());
		    
   	    // resultStr = empCorpApiBIZ.listcards(listCardsReqLVO ) ;
   	    resultStr = "{'Code':5, 'Error:'Missing parameters'  } " ;
	   
	 	JSONObject json1 = new JSONObject(resultStr);
	 	JSONArray  getArrayCards = json1.getJSONArray("Result") ; 
	 	System.out.println("---- Code: " + json1.get("Code") ) ;
	 	System.out.println("---- Result: " + json1.get("Result") ) ;
	 	ListCardsResBVO listCardsResBVO ; 
		 	
	    for(int i = 0; i < getArrayCards.length(); i++)
	    {
	    	listCardsResBVO = new ListCardsResBVO() ; 
	    	JSONObject jsonCard = getArrayCards.getJSONObject(i);
		 	System.out.println("---- Alias: " + jsonCard.get("Alias") ) ;			    	
		 	System.out.println("---- CardNumber: " + jsonCard.get("CardNumber") ) ;
			 	
 
			listCardsResBVO.setAlias(jsonCard.get("Alias").toString() );
		 	listCardsResBVO.setCardNumber(jsonCard.get("CardNumber").toString() );
		 	listCardsResBVO.setExpiryMonth(jsonCard.get("ExpiryMonth").toString() );
		 	listCardsResBVO.setExpiryYear(jsonCard.get("ExpiryYear").toString() );			 	
		 	listCardsResBVO.setType(jsonCard.get("Type").toString() );
		 	listCardsResBVO.setCountry(jsonCard.get("Country").toString() );
		 	listCardsResBVO.setDateAdded(jsonCard.get("DateAdded").toString() );			 	
		 	
		 	listCardsResBVOLst.add(listCardsResBVO) ; 
		 
	    }		   
		
		return listCardsResBVOLst;
	}

  
	 				
			
}
