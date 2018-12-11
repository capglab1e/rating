package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.Feedback;


@Repository
@Transactional
public class CapStoreDaoImpl implements ICapstoreDao {
	
	//String productId = null;
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public void addFeedback(Feedback feed) {
		entitymanager.persist(feed);
		entitymanager.flush();
	}

	@Override
	public List<Feedback> getFeedbackDetails(String productId)
	{
		System.out.println("first");
		String str="select avg(rating) from Feedback where productId=:productId";
		TypedQuery<Feedback> query = entitymanager.createQuery(str,Feedback.class);
		query.setParameter("productId", productId);
		System.out.println("in dao impl");
		List<Feedback> myList=query.getResultList();
        return myList;
		
	}

	@Override
	public String updateProductRating(Feedback feed) {
		entitymanager.merge(feed);
		
		return feed.getProductId();
	}

	
	

}
