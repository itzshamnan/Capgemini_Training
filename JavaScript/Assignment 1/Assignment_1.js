
// sUM OF NUMBERS FROM 1 TO N
function add(){
    var sum=0;
    var a;
    a=Number(document.getElementById("first").value);
   
    for (let i = 1; i <= a; i++) {
        sum += i;
    }
    document.getElementById("answer1").value=sum;
}

//SUM OF MULTIPLES OF 3 OR 5 FROM 1 TO N
function addmultiple(){
    var sum=0;
    var a;
    a=Number(document.getElementById("second").value);
   
    for (let i = 1; i <= a; i++) {
        if(i%3==0 || i%5==0)
            sum += i;
        
    }
    document.getElementById("answer2").value=sum;
}

//Even or Odd
function evenorodd(){
    var a,b;
    a=Number(document.getElementById("third").value);
    if(a%2==0)
        b="Even";
    else
        b="Odd";
        document.getElementById("answer3").value=b;
}

//Heads Probabilty 
function flip(fourth){
    var a=Math.random();
    document.getElementById("answer4").value=a;
}

//Next 20 Leap Years
function leapYears() {
    var yearsPrinted = 0;
    var currentYear = 2021;
    while (yearsPrinted < 20) { 
        if ((currentYear % 4 === 0) && (!((currentYear % 100===0) && (currentYear % 400 !== 0)))) {
            document.write(currentYear+"<br>")
            yearsPrinted++;
            currentYear++;
        } else {
            currentYear++;
        }
    }       
}

//Array in Recangular Frame

var x = 0;
var array1 = Array();
function add_element_to_array()
{
 array1[x] = document.getElementById("text1").value;
 x++;
 document.getElementById("text1").value = "";
}
function display_array()
{
   var e = "";       
   for (var y=0; y<array1.length; y++)
   {
     e +="<br/>*"+ array1[y] + "*";
   }
   document.write("*********"+e+"<br>*********");
}


//Currency Exchange
function currency(){
    var a,rupee,yen,euro,pound;
    a=Number(document.getElementById("dollar").value);
    rupee = a*74.28;
    yen=a*109.14;
    euro=a*0.84;
    pound=a*0.72;
    document.getElementById("rupee").value=rupee;
    document.getElementById("yen").value=yen;
    document.getElementById("euro").value=euro;
    document.getElementById("pound").value=pound;
}


//Fibonacci First 100
function fib(){
    var n1=0;
    var n2=1;
    for (let i = 1; i <= 100; i++) {
        document.write(n1+"<br>");
        nextTerm = n1 + n2;
        n1 = n2;
        n2 = nextTerm;
    }
}


//Reversing Array
var array2 = Array();
function add_element_to_array1()
{
 array2[x] = document.getElementById("text2").value;
 x++;
 document.getElementById("text2").value = "";
}
function display_array1()
{
   var e = array2.reverse();
   document.write("Original Array "+array2)       
   document.write("<br>Reversed Array "+e);
}


