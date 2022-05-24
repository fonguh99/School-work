ages = []
i = 0
while i < 3:
    age = int(input())
    ages.append(age)
    if min(ages) < 16:
        print("Too young!")
        break
    i += 1
else:
    print("Get ready!")
