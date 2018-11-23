package com.oviya.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oviya.models.Authorities;
import com.oviya.models.Customer;
import com.oviya.models.User;
@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {
@Autowired
private SessionFactory sessionFactory;
	
public void RegisterCustomer(Customer customer) {
Session session=sessionFactory.getCurrentSession();
User user=customer.getUser();
Authorities authorites=user.getAuthorities();
session.save(customer);
// TODO Auto-generated method stub

	}

	public boolean isEMailUnique(String EMail) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class,EMail);
		if(user==null)
			return true;
		else
			return false;
		
		// TODO Auto-generated method stub
		}

}
