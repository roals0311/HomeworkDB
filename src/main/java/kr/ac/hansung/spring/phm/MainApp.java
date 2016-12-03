package kr.ac.hansung.spring.phm;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"kr/ac/hansung/spring/phm/bearns/bearns.xml");
		

		OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");

		
		List<Offer>offerList = offerDAO.getOffers();
		for(Offer offer: offerList){
			
			System.out.println(offer);
		}
		
		
		
		context.close();
	}

}
