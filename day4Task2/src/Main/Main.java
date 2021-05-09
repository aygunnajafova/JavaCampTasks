package Main;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1,"Aygun","Najafova",LocalDate.of(2002,1,15),"0123456789"));

	}

}
