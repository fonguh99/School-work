class BankAccount:
    def __init__(self, balance):
        self._balance = balance

    def __repr__(self):
        return "Account Balance: {}".format(self._balance)

    def deposit(self, amount):
        # your code goes here
        self.amount = amount
        self._balance = self._balance + self.amount


acc = BankAccount(0)
acc.deposit(int(input()))
print(acc)
