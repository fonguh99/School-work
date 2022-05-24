# change the function
def adder(x, *args):
    print(x+sum(args))


adder(2, 3)
adder(2, 3, 4)
adder(1, 2, 3, 4, 5)
