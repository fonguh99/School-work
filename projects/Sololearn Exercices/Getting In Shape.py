file = open("/usercode/files/pull_ups.txt")
n = int(input())

#your code goes here
list=file.readlines()
print(list[n])

file.close()