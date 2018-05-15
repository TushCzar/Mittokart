package com.mittokart;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mittokart.util.EMF;

public class Test extends HttpServlet {
	@Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) {
		 EntityManager em = EMF.get().createEntityManager();
	}
}
