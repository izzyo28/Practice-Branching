In this exercise, we are going to utilize else-if statements. 

This little program will determine the discount for customers at a thrift shop. 

To start, check if the age of the customer is less than 16.
```
if (age < 16)
{
   System.out.println("Your discount is 5% ");
}
```
Next check if the customer's age is greater than 65, to check if they're eligible for a senior discount.
```
else if (age > 65)
{
   System.out.println("Your discount is 15% ");
}
```
Finally check if the customer is a student. This would cover the population of people between 16 and 65 years of age who are students. Print "Your discount is 10% " for this check.

Use a simple else at the end of your else-if statements to be a catch all for those who are between 16 and 65 who are not students.
```
else
{
   System.out.println("No discount.");
}
```

***So far we have covered if-then and if-else statements. How do we know when to use each one?***
Use two if statements if both if statement conditions could be true at the same time. For example, you can be a student and a senior citizen, double the discounts! Use an if/else statement if the two conditions are mutually exclusive meaning if one condition is true the other condition must be false. 