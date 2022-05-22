import re
Id = input()

# your code goes here
pattern = r"[A-Z][A-Z][0-9][0-9]$"
if re.search(pattern, Id):
    print("Searching")
else:
    print("Wrong format")
