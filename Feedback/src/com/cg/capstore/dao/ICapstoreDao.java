package com.cg.capstore.dao;

import java.util.List;

import com.cg.capstore.dto.Feedback;

public interface ICapstoreDao {
	public void addFeedback(Feedback feed);
	public List<Feedback> getFeedbackDetails(String prodId);
	public String updateProductRating(Feedback feed);
	/*public List<Integer> getAvgRating(String productId);
	public void save(Feedback product);*/
	
	
}
