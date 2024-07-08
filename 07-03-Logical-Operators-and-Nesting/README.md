In this exercise, we will use if-else statements with nesting and logical operators, like and, or, and not. 

We want to run a number through a filter (aka if-else statements) to see how logical operators and nesting can help refine decision making in your code. 

We are going to be creating a program that helps people check if they are eligible for voting, using if-else statements and nesting.

To start, create and if-else statement with an expression that checks whether someone is greater than or equal to 18 years of age AND is a US citizen. Use the given variables to use in your expression. For this condition use && instead of a single & so the compiler checks both of the conditions instead of just one.

You should have something that looks like this:
```
if(age >= 18 && UScitizen)
{

}
else
{

}
```
Next, inside the first portion of you if-else, create another if-else statement that checks is their age is greater than 59. If they're older than 59 use a print statement to display "You are eligible to vote AND you have the option for voting assistance!". Otherwise, use a print statement to display "You are eligible for voting!".

Finally, in the outer if-else statement print "You are not eligible for voting.".
