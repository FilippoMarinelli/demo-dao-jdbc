package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
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
		
		/*System.out.println("\"=== TEST 3: ");
		List<Seller> sellers = sellerDao.findAll();
		
		for(Seller obj : sellers) {
			System.out.println(obj);
		}*/
		
		/*System.out.println("=== TEST 4: ");
		Department department2 = new Department(2,null);
		Seller seller2 = new Seller("joao", "joao@gmail.com", sdf.parse("22/11/2000"), 5000.0, department2);
		
		sellerDao.insert(seller2);*/
		
		System.out.println("=== TEST 5: ");
		Department department2 = new Department(2,null);
		Seller seller2 = new Seller(13, "joao", "joao@gmail.com", sdf.parse("22/11/2000"), 3000.0, department2);
		
		sellerDao.update(seller2);
		
		System.out.println("=== TEST 6: ");
		sellerDao.deleteById(13);
	}

}
