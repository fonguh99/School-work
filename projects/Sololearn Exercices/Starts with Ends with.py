import re

word = input()
# your code goes here
pattern = r"^m..e$"
if re.match(pattern, word):
    print("Match")
else:
    print("No match")
