Package Sorter
This was a technical screen challenge where I had to write a function for a robotic arm that sorts packages into the right stack based on their size and weight.
What it does
You enter the width, height, length and mass of a package and it tells you which stack it goes to.

STANDARD - normal package, nothing unusual
SPECIAL - either too big or too heavy to handle automatically
REJECTED - both too big and too heavy, can't be processed at all

Rules I followed
A package is considered bulky if its volume (width x height x length) is 1,000,000 cm³ or more, or if any one side is 150 cm or longer.
A package is heavy if it weighs 20 kg or more.

How to run it
Make sure Java is installed, then open your terminal or command prompt where the file is saved.
Compile it first:
javac Sortpackages.java
Then run it:
java Sortpackages
It will ask you to enter the dimensions and mass one by one. After showing the result, it asks if you want to try another one.
Example
Sorting of Packages using Robotic Arm

Enter width in CM: 100
Enter height in CM: 100
Enter length in CM: 100
Enter mass in KG  : 20

 The Stack is: REJECTED

If you want to try another Sort? (yes/no): no
Thank You :) .

A few things I tested

Small light package → STANDARD
Heavy package but normal size → SPECIAL
Big volume but light → SPECIAL
One side over 150 cm → SPECIAL
Big and heavy together → REJECTED
