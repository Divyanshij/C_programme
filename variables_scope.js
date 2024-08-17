//the way varibles is described is called as scopes and in js there are three types of scopes
let globalVar ='global variable';

function demo(){
    if(true){
        let globalVar = 'new global variable' //block scoped variables
        console.log(globalVar); 
}
    globalVar = 'local variable' //function scoped variabels
}
demo();   

console.log(globalVar);