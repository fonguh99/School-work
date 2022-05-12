import math

p1 = (23, -88)
p2 = (6, 42)

# your code goes here
x = p2[0]-p1[0]
y = p2[1]-p1[1]
arg = (x**2)+(y**2)
dist = math.sqrt(arg)
print(dist)
