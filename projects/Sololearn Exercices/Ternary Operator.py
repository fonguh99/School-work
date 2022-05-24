balance = int(input())
to_cash = int(input())

# change the code
money_left = balance-to_cash if 500 <= to_cash <= balance else "Error"

print(money_left)
