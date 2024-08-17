/*
->objects- it is a collection of property(name,value(no.,string , object ,method))
->buitInObjects and custom objects
->primitive data type (boolean,number,string,nulland undefined),reference data type(objects)
*/
//ARRAY OBJECTS
let phones =[1100,'one Plus 6t',6300];
console.log('phones array :',phones);
console.log('array length:',phones.length);

for(let i=0;i<phones.length;i++){
    console.log('Index : ',i,'array element : ',phones[i]);
}

phones[3]='iphone X';
console.log('after adding new element:',phones);
phones.push('motorola');
console.log('after adding new element:',phones);
phones.pop();
console.log('after removing  element:',phones);

//forEach():used to iterate array elements in a simple fashion
phones.forEach((element)=>{console.log('array elements :',element)});

//map():used for creating a mapped array(an array created after applying some transformation to the existing array).

let mappedarray = phones.map((phone)=>{
    if(typeof phone ==='string'){
        return phone.toUpperCase();
    }
   
})
console.log('Array :',mappedarray);

//filter(): filter all the element in the array
let filteredPhones = phones.filter((phone)=>{return typeof phone ==='string';});
console.log('Filtered Array: ',filteredPhones);

//find(): find a particular element in an array
let foundPhone = phones.find((phone)=>{return phone === 'one Plus 6t'});
console.log(' element found :',foundPhone);

//STRING OBJECT
let mystring = 'Aeroplane';
 console.log('first character of string',mystring[0]);

 let index = mystring.indexOf('water');
 console.log('Index value :', index);

 let charat = mystring.charAt(6);
 console.log('index of 6 index :',charat);

 let splitarr =  mystring.split('e',2);
 console.log('splitted array :',splitarr);

 let substring = mystring.substring(0,4);
 console.log('substr : ',substring);

 let uppercasestring = mystring.toUpperCase();
 let lowercasestring = mystring.toLowerCase();

 console.log('Upper case : ',uppercasestring);
 console.log('Lower case : ',lowercasestring);

//concat():helps to join two strings

//DATE OBJECT

let dateOne = new Date();
console.log('Dateone :',dateOne);
console.log('In milliseconds :',dateOne.getTime());
console.log('Date :',dateOne.getDate());
console.log('Month :',dateOne.getMonth());
console.log('Year :',dateOne.getFullYear());

dateOne.setFullYear(2050,10,11);
console.log('After setting date information :',dateOne);

let today =  new Date();
let datediff = (dateOne - today) / (1000*60*60*24);

console.log('Difference days :',Math.floor(datediff));
 //toLocaleString()-Prints both date and time stamp info. in string format
 //toLocaleDateString()-Prints only date info. in string format
 console.log('today in string :',today.toLocaleString());
 console.log('only date in the string format :',today.toLocaleDateString());
 let newdate = new Date('07-15-2016');
 console.log('New Date :',newdate);