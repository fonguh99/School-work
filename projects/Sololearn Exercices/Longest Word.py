txt = input()

# your code goes here
longest = max(txt.split(), key=len)
print(longest)
