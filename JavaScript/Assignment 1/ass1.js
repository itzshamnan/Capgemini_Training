//Combining two arrays
function concatenate(a,b){
   
    return(a.concat(b));
    }
    
    let arr1 = [0, 1, 2];
    let arr2 = ["a", "b", "c"];
    document.write(concatenate(arr1,arr2));
    console.log(concatenate(arr1,arr2));

//Combining two lists by alternatively taking elements
function concatenate(a,b){
    let arr3 = new Array;
    for(i = 0,j=0,k=0;i<a.length&&j<b.length&&k<(a.length+b.length);i++,j++,k++){
        arr3[k]=a[i];
        arr3[++k]=b[i];
    }
    return arr3;
 
     }
     
     let arr1 = [0, 1, 2];
     let arr2 = ["a", "b", "c"];
     document.write(concatenate(arr1,arr2));
     console.log(concatenate(arr1,arr2));

//Reversing an array
const a =[1,2,3,4,5,6,7,8,9,10];
k="Array before reversing: <br>"
for(i=0;i<a.length;i++)
{
    k+=a[i]+" ";
    //document.getElementById("first").innerHTML=k;
}
k+="<br> After reversing <br>"
for(i=a.length-1;i>=0;i--)
    k+=a[i]+" ";



document.write(k);


//Longest Token
const n = parseInt(prompt("Enter the value of n: "));
var sum = 0;

for(i = 0;i<=n;i++)
    if(i%3==0||i%5==0)
        sum+=i;


console.log(`The sum is ${sum}`); 
prompt(sum); 

//Sum of numbers in an array using loops
function evenORodd(n1)
{
    if (n%2==0)
     return "even"
     else
     return "odd"

}


const n = parseInt(prompt("Enter the value of n: "));
document.write(evenORodd(n));


//Operations on Array of 100 values
var sum = 0;
var min,max,avg=0;
var even_count=0,odd_count=0,count="";
var arr=[];
for (i =0; i<100; i++)
{
	arr.push(Math.round(Math.random() *100))

}
for (i =0; i<100; i++)
{
	sum+=arr[i];
    if(arr[i] % 2 == 1)
        odd_count++;
    else
        even_count++;

}
if(even_count>odd_count)
	count="even";
else if(even_count==odd_count)
	count="equal";
else
	count="odd";
avg=sum/100;
min=Math.min(...arr);
max=Math.max(...arr) ;
var s="maximum number:"+max+"<br>"+"minimum number:"+min+"<br>"+"highest count is:"+count+"<br>"+"sum of numbers: "+sum+"<br>"+"average of numbers is: "+avg;
document.write(s);




//Bubble Sort
function bblSort(arr){    
    for(var i = 0; i < arr.length; i++){            
      for(var j = 0; j < ( arr.length - i -1 ); j++){   
        if(arr[j] > arr[j+1]){
          var temp = arr[j]
          arr[j] = arr[j + 1]
          arr[j+1] = temp
        }
      }
    }
    console.log(arr);
   }
     
var arr=[];
    for (i =0; i<20; i++)
    {
        arr.push(Math.round(Math.random() *100))

    }
   bblSort(arr);


//Piglatin
function isVowel(c)
{
	return (c == 'A' || c == 'E' ||
			c == 'I' || c == 'O' ||
			c == 'U' || c == 'a' ||
			c == 'e' || c == 'i' ||
			c == 'o' || c == 'u');
}

function pigLatin(s)
{
	let len = s.length;
	let index = -1;
	for (let i = 0; i < len; i++)
	{
		if (isVowel(s[i]))
		{
			index = i;
			break;
		}
	}
	if (index == -1)
		return "-1";

	
	return s.substring(index) +
		s.substring(0, index)
						+ "ay";
}
str2="Shamnan";
document.write("Original String : "+str2+"<br>");
document.write("Converted to Pig Latin : ");
str = pigLatin(str2);

if (str == "-1")
	document.write("No vowels"
			+ "found. Pig Latin"
			+ " not possible");
else
	document.write(str);
