### Exercises with Files and composition
Today's exercises should be performed in IntelliJ. Create a GitHub repository (you may call it Torsdag5 or something similar) with a README file. The README file must contain your name and student e-mail.
<details>In IntelliJ, choose New Project from Version Control, to open the repository.</details>
Each task must be created as a new package (folder) in the project's src directory. Name each package according to the task, eg. "Task1". In each package, create a class <code>Main</code> with a <code>public static void main(String<> args)</code> - method which will be used to start the program and call the methods required to complete the task.

Please note, that it is quite unusual to have a Main class in each package, yet this is done so for the sake of the exercise.

---
## Task1: ArrayList og objekter
1.a Create a class, Customer, with private attributes (fields/ instance variables): 
<code>

	String firstName
	String lastName
	String username
	int id
	static int counter
</code>

1.b Create a constructor taking the name and username as parameters.

1.c Increase the <code>counter</code> by one for each call to the constructor, and use the <code>counter</code> to initialize the <code>id</code>.

1.d Create <code>getter()</code> methods and a <code>toString()</code> override.

1.e Create a Main class with a <code>main()</code> method. Declare and instantiate an <code>ArrayList</code> called <code>customerList</code>. Add three or more customers to the <code>customerList</code>.
(You may instantiate the customers first, and then add them to the list. Or you may add and instantiate on the same line.)
<details> <code>
  
	Customer c1 = new Customer("fornavn", "efternavn", "brugernavn");
	customerList.add(c1);
</code>

OR

<code>
	
	customerList.add(new Customer("fornavn", "efternavn", "brugernavn"));
</code>
</details>

1.f Create a static method in the Main class called <code>printCustomers(ArrayList customers)</code>, in which you print out all the customers by looping through the customers with a 'for each' loop. Test this method from you main() method by passing the <code>customerList</code> as an argument. Note that the datatype is missing from the ArrayList declaration.

---
## Task 2: Load coffee menu for a cafe
In this program we will load a list of coffee names and display it to the user. We will create a Cafe class that loads the list and a Main class that tests that the Cafe class works as expected.

2.a Above you will see a file called coffees.txt. Open it and check that is contains 5 names for types of coffee. Download it, or copy the text to a new textfile and save it with the same name. Place coffees.txt in the same folder as the classes you will write for this task.

2.b Create a class called Main with a main method. 

2.c Create another class called Cafe. Give it an attribute called 'coffeeMenu' of type ArrayList\<String\>. 
(Later you will fill this ArrayList with the names of the coffees from the textfile).

2.c In the Cafe class, add a method <code>loadMenuData</code> 
Have the method load the coffees.txt file like this:
<code>File file = new File("coffees.txt) </code>  
(make sure that the path is right)

2.d In this step you will read from the file, using a Scanner object: Add the <code>file</code> instance to a new Scanner object. (This piece of code will need to be wrapped in a try -catch block)

The solution to this step is given below, but give it a go before peeping.
<details>
  <summary> Peep the solution to this step:
  </summary>
  <code>
		  
	try {
		Scanner scan = new Scanner(file); 
	}catch(FileNotFoundException e){
 		System.out.println("File not found. Check path and filename");  
	}
</code>
Remember to import <code>java.util.Scanner</code> and <code>java.io.FileNotFoundException</code>
</details>


2.e Inside the try block from the last step, you will now add this piece of code that loops over the lines of the textfile:


Use a while loop with the <code>hasNextLine()</code> and <code>nextLine()</code> -methods called on the Scanner instance, to loop over the lines of the file and add the lines to the coffees ArrayList in this class.
<details>
  <summary> peep solution:
  </summary>
<code>

	  while(scan.hasNextLine()){
		coffeeMenu.add(scan.nextLine());
	}
</code>      
</details>

2.g In the main method create a new instance of the Cafe class and call its <code>loadMenuData()</code> -method.

2.h Still in the main method, print all the elements of the  attribute <code>coffeeMenu</code> of the Cafe instance you just created.
<details>
  <summary> Hint:</summary>
  you can use a loop, and in the body of the loop use the <code>get()</code> method of ArrayList, to get hold of the item before printing it.
</details>



---
## Task 3: Buildings and Rooms
This task is an excercise in accessing fields in objects within objects. You will create a building with some rooms. Each room will have some attributes which you will access(read the value of) in order to draw conclusions about the building in which the rooms are placed.

The diagram below shows the attributes and method signatures refered to in steps 3.a to 3.f.
![class diagram](https://github.com/Dat1Cphbusiness/Torsdagsopgaver-5---Files-and-Composition/blob/main/doc/classdiagram.png)

3.a Create a Room class with the following fields (use appropriate types and make them private): 
- numberOfDoors
- numberOfLamps
- numberOfWindows

3.b Create a constructor that populates all the fields above.

3.c As the fields of the Room class are private, create getter()-methods for them, 

3.d Create a Building class with the following fields (use appropriate types):
- rooms 
   <details>
        <summary>
          Hint  
        </summary>
        This should be a datatype that can hold multiple objects of type Room, fx. an ArrayList.
    </details>
- numberOfBathrooms
- numberOfFloors
- isOfficeBuilding

3.e Create a constructor that populates all the fields above. 

3.f As the fields of the Building class are private, create getters() for them.
    
3.g In your main method, declare and instantiate an ArrayList and add at least three different rooms to the ArrayList. 

3.h In your main method, instantiate a new building, you may use the previously instantiated ArrayList as one of the arguments.

3.i Create a static method in Main, <code>countLampsInBuilding</code>, that takes an object of type Building, and returns the total number of lamps in the entire building.
<details>
<summary>
   Hint 1
</summary>
 Consider the return type of the method.

You will need to have a loop in the body of the method that looks at each room in the building to add the number of laps in each room.
</details>
<details>
<summary>
   Hint 2
</summary>
You will need an <code>int counter</code> variable, initialized outside the loop. 

You can get the roomslist by using the method <code>getRooms()</code> on the building parameter.
 
You can get the numberOfLamps from the room by using the <code>getNumberOfLamps()</code> method on the room variable inside the loop.
</details>

3.j Create another static method in Main, isNormal, that takes an object of type Building. The method should return true if the Building's numberOfFloors is less than its number of Rooms. If not it should print "This is an odd building" and return false.

---
