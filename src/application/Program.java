package application;

import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println("=== TEST 2: Seller findByDepartment ====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println(seller);

	}

}
