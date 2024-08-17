let firstObject ={};
console.log('firstObject',firstObject);

let secondObject = {id :177 , name : 'jane' , age : 25};
console.log('secondObject :',secondObject);
//The properties present inside the literal object can be accessed by using either a dot notation or a bracket notation

console.log('dot notation',secondObject.id);
console.log('bracket notation',secondObject['name']);

secondObject.id = 188;
console.log('New id',secondObject.id);

let name = 'john';
let age= 42;

let empObj = {
    empname : name,
    empage : age

};
console.log('EmpObj',empObj);

let empObjes6={
    name,
    age
};
console.log('newES6style',empObjes6);
//To access the values present in literal object,use the object.values() method
console.log('values of secondObject',Object.values(secondObject));
console.log(Object.values(empObj));
console.log('to the main power of the charcter on the main house of the main offics');
console.error('log in the main charcter of the office in the');