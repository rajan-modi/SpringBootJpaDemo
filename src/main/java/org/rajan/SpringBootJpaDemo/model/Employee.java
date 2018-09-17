package org.rajan.SpringBootJpaDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
    private Integer emp_no;
    private String first_name;
    private String last_name;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    @Override
    public String toString() {
    	return "Employee No : "+emp_no+" First Name : "+first_name+" Last Name : "+last_name;
    }
}
