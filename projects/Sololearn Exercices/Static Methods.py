class Calculator:
    # your code goes here
    @staticmethod
    def add(a, b):
        return a + b


n1 = int(input())
n2 = int(input())

print(Calculator.add(n1, n2))
