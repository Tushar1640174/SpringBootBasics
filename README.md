# SpringBootBasics
Basics of SpringBoot
To run this project in local, Please setup postman to hit the webservices present in HomeController1.java class

You can create database in your Mysql DB with name "springboot" or you can change your database name in application.properties file and set up your own username and passwords accordingly

while running for the first time, either save the data manually into mysql data base or you can run any of the below steps:

1). use Post method in postman with below data inserted into Body section with JSON selected as option:

eg-
{
    "fullname": "LAXMAN",
    "profile": "Software Engineer",
    "address": {
        "city": "London",
        "zipcode": "123456",
        "state": "Manchestar"
    }
}


2). or you can edit HomeController1.java class with below details:

@PostMapping("/employee")
	public Employee insert(@RequestBody Employee employee)
	{
		
		 Address ad=new Address("London","Software Engineer","123456"); 
		 Employee emp=new Employee("LAXMAN","Analyst",ad);
		 
		Employee e=employeeService.insert(employee);
		return e;
	}


 once the initial data is inserted into DB, you can further edit this java class to initial value to use these Basic GET, PUT, POST, DELETE weservices.
