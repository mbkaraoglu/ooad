from abc import ABCMeta, abstractmethod

class Shape:
    __metaclass__ = ABCMeta             # allows Shape to behave like an abstract class

    def __init__(self, color, area):
        self.color = color
        self.area  = area

    def __lt__(self, other_shape):      # function used to compare Shape classes by area attribute
         return self.area < other_shape.area

    @abstractmethod
    def display(self):
        pass

class Triangle(Shape):

    def __init__(self, color, area):
        super(Triangle, self).__init__(color, area)  # calling constructor of parent class

    def display(self):
        print("I am a {} triangle with area {}".format(self.color, self.area))

class Square(Shape):

    def __init__(self, color, area):
        super(Square, self).__init__(color, area)

    def display(self):
        print("I am a {} square with area {}".format(self.color, self.area))

class Circle(Shape):

    def __init__(self, color, area):
        super(Circle, self).__init__(color, area)

    def display(self):
        print("I am a {} circle with area {}".format(self.color, self.area))



def main():

    shapes = []

    t = Triangle("blue", 4)
    print("Creating a blue triangle with area 4...")
    s = Square("green", 3)
    print("Creating a green square with area 3...")
    c = Circle("red", 5)
    print("Creating a red circle with area 5...")

    shapes.extend((t, s, c))
    shapes.sort()
    print("Sorting shapes...")

    for shape in shapes:
        shape.display()


if __name__ == "__main__":
    main()
