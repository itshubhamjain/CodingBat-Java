// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
public boolean sleepIn(boolean weekday, boolean vacation) {
  if(!weekday || vacation)
    return true;
  return false;
}

// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
// We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile == bSmile )
    return true;
  return false;
}

// Given two int values, return their sum. Unless the two values are the same, then return double their sum.
public int sumDouble(int a, int b) {
  int sum = a+b;
  if(a==b) return sum*2;
  return sum;
}

// /* Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.
public int diff21(int n) {
  int res = 21-n;
  if(n>21)
    res = Math.abs(res)*2;
  return res;
}

// We have a loud talking parrot.
// The "hour" parameter is the current hour time in the range 0..23.
// We are in trouble if the parrot is talking and the hour is before 7 or after 20.
// Return true if we are in trouble. 
public boolean parrotTrouble(boolean talking, int hour) {
  return (talking && (hour<7 || hour>20));
}

// Given 2 ints, a and b
// return true if one if them is 10 or if their sum is 10.
public boolean makes10(int a, int b) {
  return (a==10 || b==10 || a+b==10);
}

// Given an int n, return true if it is within 10 of 100 or 200.
// Note: Math.abs(num) computes the absolute value of a number. 
public boolean nearHundred(int n) {
  int val1 = 100-n;
  int val2 = 200-n;
  return (Math.abs(val1) <=10 || Math.abs(val2) <=10);
}

// Given 2 int values, return true if one is negative and one is positive.
// Unless the parameter "negative" is true, then they both must be negative.
public boolean posNeg(int a, int b, boolean negative) {
  if(negative && (a<0 && b<0))
    return true;
  return !negative && (a<0 && b>0 || b<0 && a>0);
}

// Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings. 
public String notString(String str) {
  String[] s = str.split(" ",2);
  if(s[0].equals("not"))
    return str;
  return "not " + str;
}

// Given a non-empty string and an int n, return a new string where the char at index n has been removed.
// The value of n will be a valid index of a char in the original string.
// (i.e. n will be in the range 0..str.length()-1 inclusive). 
public String missingChar(String str, int n) {
  return str.substring(0,n) +str.substring(n+1);
}

// Given a string, return a new string where the first and last chars have been exchanged
public String frontBack(String str) {
  if(str.length()<=1) return str;
  char[] c = str.toCharArray();
  char temp = c[0];
  c[0] = c[c.length-1];
  c[c.length-1] = temp;
  return new String(c); 
}

/*
new String(char[]); //"cad"
String.valueOf(c); //"cad"
Arrays.toString(c); //"[c,a,d]"
*/


// Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3, the front is whatever is there.
// Return a new string which is 3 copies of the front. 
public String front3(String str) {
  if(str.length()>2) 
  str = str.substring(0,3);
  StringBuilder sb = new StringBuilder();
  for(int i=0;i<3;i++)
  sb.append(str);
  return sb.toString();
}

// Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more. 
public String backAround(String str) {
  StringBuilder sb = new StringBuilder();
  char c = str.charAt(str.length()-1);
  sb.append(c);
  sb.append(str);
  sb.append(c);
  return sb.toString();
  //String sub = str.substring(str.length()-1);
  //return sub + str + sub;
}

// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there. 
public String front22(String str) {
  if(str.length()<2) return str + str + str;
  String s = str.substring(0,2);
  return s + str + s;
}

// Given a string, return true if the string starts with "hi" and false otherwise.
public boolean startHi(String str) {
  return str.startsWith("hi");
}

// Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
public boolean icyHot(int temp1, int temp2) {
  return (temp1<0 && temp2>100) || (temp2<0 && temp1>100);
}

// Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
public boolean in1020(int a, int b) {
  return ((a>=10 && a<=20) || (b>=10 && b<=20));
}

// Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
public boolean hasTeen(int a, int b, int c) {
  return (a>=13 && a<=19 || b>=13 && b<=19 || c>=13 && c<=19 );
}

// We'll say that a number is "teen" if it is in the range 13..19 inclusive.
// Given 2 int values, return true if one or the other is teen, but not both. 
public boolean loneTeen(int a, int b)
{
	return (((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) || (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19)));
}


// Given a string, if the string "del" appears starting at index 1,
// return a string where that "del" has been deleted. Otherwise, return the string unchanged. 
public String delDel(String str)
{
	if(str.indexOf("del") == 1)
		return (str.charAt(0) + str.substring(4, str.length()));
	else
		return str;
}

// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 
public boolean mixStart(String str) {
  if(str.length()>2 && str.charAt(1)=='i' && str.charAt(2)=='x')
    return true;
  return false;
}

// Given a string, return a string made of the first 2 chars (if present),
// however include first char only if it is 'o' and include the second only if it is 'z',
// so "ozymandias" yields "oz". 
public String startOz(String str) {
    if(str == null || str.length()==0) return str;
    if(str.length()>=2 && str.charAt(0) =='o' && str.charAt(1) =='z')
    return "oz";
    else if(str.charAt(0) =='o')
    return "o";
    else if(str.charAt(1) =='z')
    return "z";
  return "";
  
}

// Given three int values, A B C, return the largest. 
public int intMax(int a, int b, int c) {
  return a>b?(a>c?a:(c>b?c:b)):(b>c?b:c);
}

// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
// Note that Math.abs(n) returns the absolute value of a number.
public int close10(int a, int b) {
  int abs_a = Math.abs(10-a);
  int abs_b = Math.abs(10-b);
  if(abs_a>abs_b)
    return a;
  else
    return b;
  return 0;
}


// Given 2 int values, return true if they are both in the range 30..40 inclusive,
// or they are both in the range 40..50 inclusive.
public boolean in3050(int a, int b) {
  return (a>=30 && a<=40) && (b>=30 && b<=40) || (a>=40 && a<=50) && (b>=40 && b<=50);
}

// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
// or return 0 if neither is in that range.
public int max1020(int a, int b) {
  if(a>=10 && a<=20 && b>=10 && b<=20 )
    return a>b?a:b;
  if(a>=10 && a<=20)
    return a;
  if(b>=10 && b<=20 )
    return b;
  return 0;
}

// Return true if the given string contains between 1 and 3 'e' chars. 
public boolean stringE(String str) {
  int count =0;
  for(char c : str.toCharArray()){
    if(c == 'e') count++;
  }
  return count>=1 && count<=3;
}