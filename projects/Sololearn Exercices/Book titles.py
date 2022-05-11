file = open("/usercode/files/books.txt", "r")

# your code goes here
titles = file.readlines()
for i in titles:
    if '\n' in i:
        print(i[0] + str(len(i) - 1))
    else:
        print(i[0] + str(len(i)))


file.close()
