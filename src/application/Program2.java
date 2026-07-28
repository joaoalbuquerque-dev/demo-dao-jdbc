package application;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: department findById ====");
        Department department = departmentDao.findById(6);
        System.out.println(department);


        sc.close();
    }
}
