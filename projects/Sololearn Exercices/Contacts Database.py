import re

# your code goes here
num = input()
num = re.sub(r"^00", "+", num)
print(num)
