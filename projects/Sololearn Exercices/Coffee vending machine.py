coffee = ["Café Latte", "Caffe Americano", "Espresso", "Cappuccino", "Macchiato"]

choice = int(input())

try:
	#your code goes here
	 print(coffee[choice])
except:
	#and here
	print("Invalid number")
finally:
	#and finally here
	print("Have a good day")