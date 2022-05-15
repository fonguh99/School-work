txt = input()


def words(txt):
    # your code goes here
    for word in txt.split(" "):
        yield word


print(list(words(txt)))
