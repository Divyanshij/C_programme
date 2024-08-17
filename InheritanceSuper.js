class Employee{
    constructor(empId,empName){
        this.id = empId;
        this.name = empName
    }
    swipeIn(){
        console.log('Employee id',this.id,'has swiped at',new Date().toLocaleDateString());
    }
    static code (){
        console.log('Employee is coding');
    }
}
//The parent class constructor isinvoked in the child clss using super()
class PartTimeEmployee extends Employee{
      constructor(empid,empname,contractPeriod){
           super(empid,empname);
           this.contractPeriod = contractPeriod;
      }
      swipeIn(){
        console.log('Contract Employee Swiped In');
        super.swipeIn();
      }
}

let empChild = new PartTimeEmployee(787,"Mark",3);
PartTimeEmployee.code();
empChild.swipeIn();
/*
->create a sub-class using the extends keyword
->acess the inherited properties and methods from child class
->use super keyword to call parent class properties
*/