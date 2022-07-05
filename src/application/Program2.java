package application;

import java.util.List;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== teste 1:");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== teste 2:");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		/*System.out.println("=== teste 3:");
		Department dep2 = new Department("Computacao");
		departmentDao.insert(dep2);*/
		
		/*System.out.println("=== teste 4:");
		Department dep2 = new Department(4, "otario");
		departmentDao.update(dep2);*/
		
		System.out.println("=== teste 5:");
		departmentDao.deleteById(5);
	}

}
