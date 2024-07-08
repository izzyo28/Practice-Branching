```
switch(expression) {
 case x:
  // code block
  break;
 case y:
  // code block
  break;
 default:
 // code block
}
```
In this exercise we are going to use a switch statement to check a letter grade. Use the general format of a switch statement, given above.

First create a variable called grade and assign is a capitalized char value of 'B'.
```
char grade = 'B';
```
Next begin your switch statement with the switch  keyword and place your grade variable within the switch's parenthesis. This is called the controlling expression and it is integer-based, instead of boolean-based like if statements. Remember that char variables are an integer-based value because the letter refers to a number in the ASCII table.

Now, create five cases and a default to your switch. Here is the first one completed for you:
```
case 'A':
  System.out.println("Excellent!\n" );
  break;
```
Here is the output for the next cases.
For case B do nothing. ***_No break statement._***
For case C set the print statement to be "Well done\n".
For case D set the print statement to be "You passed\n".
For case F set the print statement to be "Better try again\n".
For the default set the print statement to be "Invalid grade\n".


Notice the output for the grade B is the same as the input for the letter grade C. They have the same output because of the _waterfall effect_ that switch statements have. This means that if there is **no** break statement forcing the program to jump out of the switch, then it will fall into the next case.