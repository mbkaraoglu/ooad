The shapecollection.py program is a Python program that does exactly the same routines outlined in the shape problem on HW1.
To achieve polymorphism, I use a Shape class, which acts like a Java abstract class by specifying the class's metaclass as ABCMeta.
This way, the Shape class can't be instantiated on its own. I also use the abstractmethod decorator to specify that certain methods 
of the Shape class are abstract methods. I create a list of three different Shapes (Triangle, Circle, Square) with different areas
and colors and sort them by their area with the help of the `__lt__()` function. After the list of Shapes is sorted, I go through the 
list and call the `display()` method of each object, which displays the type, area, and color of the shape.  

This program is written in Python 2.7, and will need a Pyton 2.7 interpreter to run. Running it can simply be done by doing
`python shapecollection.py` in a terminal.
