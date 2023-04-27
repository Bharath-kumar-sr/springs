package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.HOperations;
import dto.HEmployee;

@WebServlet("/create")
@MultipartConfig
public class HCreate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String no = req.getParameter("mno");
		long number = Long.parseLong(no);
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String skill = req.getParameter("skill");
		Part photo = req.getPart("photo");
		String filename = photo.getSubmittedFileName();
		System.out.println(filename);
		String path = getServletContext().getRealPath("") + "files";
		System.out.println(path);
		File file = new File(path);
		photo.write(path + file.separator + filename);

		HEmployee employee = new HEmployee();
		employee.setId(id);
		employee.setName(name);
		employee.setEmail(email);
		employee.setNumber(number);
		employee.setDob(dob);
		employee.setGender(gender);
		employee.setCountry(country);
		employee.setState(state);
		employee.setSkills(skill);
		employee.setPhoto(filename);

		HOperations hOperations = new HOperations();
		hOperations.insert(employee);
	}
}