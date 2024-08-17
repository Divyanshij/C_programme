class Employee{
      constructor(empId,empName,empAge){
        this.id = empId;
        this.empName = empName;
        this.age = empAge;
      }

     swipeIn(){
        console.log('Employee id',this.id,'has swiped in at ',new Date().toLocaleDateString())
     }


    static code(){
        console.log('Employee is coding')
    }
}
let empObj = new Employee(100,"Mark",23);

console.log('Id',empObj.id);
console.log('Name',empObj['name']);
//JS classes can also have atatic methods
//static method can be created using static keyword
empObj.swipeIn();

Employee.code();
