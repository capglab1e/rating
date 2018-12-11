package com.cg.capstore.sevice;

import java.util.List;

import com.cg.capstore.dto.Feedback;

public interface ICapstoreService {
	
	public void addFeedback(Feedback feed);
	public List<Feedback> getFeedbackDetails(String prodId);
	public String updateProductRating(Feedback feed);
	
	/*public String setAvgRating(String productId);

	public float getAvgRating(String productId);

	public float getMerchantAvgRating(String merchantId);
*/
}
