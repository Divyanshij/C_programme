let num1 =5;
let num2 = 10;
console.log('= operator: ' +num1==num2);
console.log('+operator: ' +num1+num2);
console.log('string join' ,'hello'+'world');

let data = 66;
console.log('datatype of data :', typeof data);
console.log('10**3:',10**3);
//conditional statement in js (if,ifelse ,switch)

let n=0 
if(n>0){
    console.log('n is positive ');
}
else if(n<0)
{
    console.log('n is negative');
}
else{
    console.log('n is 0')
}
//ternary operator
let age = 21;
let statue = age >=18?'eligible':'not eligible';
console.log('status is '+statue);

//switch
let choice='a';

switch(choice){
    case 'a' : console.log("trip is paris");
               break;
   case 'b' : console.log("trip to US");
               break;
   default  : console.log("trip to UK");                    
}

//iterative statement (loops)\
//for loop
for(let i=0;i<=5;i++){
    console.log(i);
}
//while
let j=0;
while( j<=5){
 console.log(j);
 j++;
}
//do while 
let k=0;
do{
    console.log('DO while '+k);
    k++;
}
while(k<=5);
//tryout
var x,y;
var chr='';
for(x=1; x <=5; x++)
{
   for (y=1; y <= x; y++)
     {
     if(y%2!=0){
        chr=chr+("*");
     }
     else{
         chr=chr+("#")
     }
         
      }
 console.log(chr);
 chr='';    
}
