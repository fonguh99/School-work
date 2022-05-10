pin = input()
try:
    # your code goes here
    int(pin)
    print("PIN code is created")

except ValueError:
    # and here
    print("Please enter a number")
