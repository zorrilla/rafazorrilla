package com.mvcoperaciones.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcoperaciones.model.OperacionesMatematicas;

/**
 * Servlet implementation class OperacionesServlet
 */
@WebServlet("/OperacionesServlet")
public class OperacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperacionesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Metodo Get fue llamado");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//response.getWriter().append("Metodo POST fue llamado");
		OperacionesMatematicas cuentitas;
		cuentitas = new OperacionesMatematicas();
		
		String snumero1;
		String snumero2;
		float fnumero1;
		float fnumero2;
		
		snumero1 =request.getParameter("txtnumber1");
		snumero2 =request.getParameter("txtnumber2");
		
		fnumero1=Float.parseFloat(snumero1);
		fnumero2=Float.parseFloat(snumero2);
		
		cuentitas.setfNumero1(fnumero1);
		cuentitas.setfNumero2(fnumero2);
		
		
		response.getWriter().append("La suma es:"+cuentitas.sumar()+"</br>");
		response.getWriter().append("la resta es:"+cuentitas.restar()+"</br>");
		response.getWriter().append("la division es:"+cuentitas.dividir()+"</br");
		response.getWriter().append("la multiplicaion es:"+cuentitas.multiplicar()+"</br");

	
	if(cuentitas.sumar()>10.0)
	{
	response.sendRedirect("mayor10.jsp");
	}
	if(cuentitas.sumar()<0)
	{
	response.sendRedirect("negativos.jsp");
	}
	if(cuentitas.sumar()>=0 &&cuentitas.sumar()<=10)
	{
		response.sendRedirect("calificaciones.jsp");
	}
	
	}

}
