package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BannerDao;
import com.dao.CompanyDao;
import com.dao.NewsTypeDao;
import com.dao.NewsDao;
import com.dao.impl.BannerDaoImpl;
import com.dao.impl.CompanyDaoImpl;
import com.dao.impl.NewsTypeDaoImpl;
import com.dao.impl.NewsDaoImpl;
import com.entity.Banner;
import com.entity.Company;
import com.entity.NewsType;
import com.entity.News;
import com.entity.Type;

public class NewsServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		CompanyDao comDao = new CompanyDaoImpl();
		Company com = comDao.queryCompany();
		request.setAttribute("company", com);
		
		BannerDao ptd = new BannerDaoImpl();
		List<Banner> pts= ptd.queryBanner();
		request.setAttribute("banner", pts);
		
		NewsTypeDao c2 = new NewsTypeDaoImpl();
		List<NewsType> ps2= c2.queryNewsType();
		request.setAttribute("newstype", ps2);
		
		NewsDao pd=new NewsDaoImpl();
		List<NewsType> pt1= pd.queryNewsType();
		
		int type1;
		if(request.getParameter("type1")==null){
			type1=pt1.get(0).getId();
		}else{
			type1=Integer.parseInt(request.getParameter("type1"));
		}
		NewsDao proDao =new NewsDaoImpl();
		
		List<News>plist1=proDao.queryNews(type1);
		request.setAttribute("plist1", plist1);
		request.setAttribute("pt1", pt1);
		request.getRequestDispatcher("/news.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
