package com.cg.capstore.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.dao.ICapstoreDao;
import com.cg.capstore.dto.Feedback;

@Service
public class CapStoreServiceImpl implements ICapstoreService {
	
	@Autowired
	ICapstoreDao dao;

	@Override
	public void addFeedback(Feedback feed) {
		dao.addFeedback(feed);
	}

	@Override
	public List<Feedback> getFeedbackDetails(String prodId) {
		
		return dao.getFeedbackDetails(prodId);
	}

	@Override
	public String updateProductRating(Feedback feed) {
		
		return dao.updateProductRating(feed);
	}

/*	@Override
	public float setAvgRating(String productId)
	{
		List<Integer> id = dao.getAvgRating(productId);
		int sum = 0;
		for (int i : id) {
			int rating = dao.addFeedback(i);

			sum = sum + rating;
		}
		float avgRating = (float)sum / id.size();
		Feedback product = dao.getFeedbackDetails(productId);

		product.setRating(avgRating);

		dao.save(product);
		return avgRating;
	}

	@Override
	public float getAvgRating(String productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getMerchantAvgRating(String merchantId) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
