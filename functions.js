function add(num1,num2){
    return num1+num2;
}
let result = add(2,1);
console.groupCollapsed('sum:',result);
//anonymus function(function as a parameter to another function)
function greet(choice)
{
    choice();
}
greet(function(){console.log('HELLO WORLD')});
//ANONYMOUS FUNCTION
//function which either accept or return other functions are called higher order functions
//------------------------------------------------------------
//FUNCTION EXPRESSION
function geet(choice){
    let message =choice();
    console.log(message);
}
let message=function(){ return 'YAY WORLD'};
geet(message);
/*1.function can be assigned to a variable
  2.functions can be passed around as a function
  3.functions can be returned from another function
  */
 function multiply(num1,num2=1){
    return num1 * num2; //default parameter
 }
 console.log(multiply(2,undefined));
//Destructured parameter
 function showDetails([arg1,arg2]){
    console.log(arg1);
    console.log(arg2);
 }
showDetails(["Andrew","James","charlie"]);
function showDetailsObj({name,country}){
    console.log(name);
    console.log(country);
 }
showDetailsObj({ name:"Andrew",age:19, country:"India"});
//ARROW FUNCTIONS(shorter way ti write anonymous function)
function greet(choice){
    choice();
}
greet(()=> {console.log('hello world')});
/*1) (parameter1,parameter2,..)=>{
    //statement 1
    //statement 2
}
LOT OF PARAMETER
*/
let calculateTripCost = (ticketPrice,noOfPerson)=>{
    totalCost= ticketPrice * noOfPerson;
    return totalCost;
}
console.log('Totoal Cost'+calculateTripCost(200,5));
/*2) ()=>//statement 1
NO PARAMETER
*/
let trip = () => console.log('Lets go to trip');
trip();
/*3) parameter1=>//statement 1
*/
 trip = place =>console.log('lets go to trip'+ place)
trip('Paris');
