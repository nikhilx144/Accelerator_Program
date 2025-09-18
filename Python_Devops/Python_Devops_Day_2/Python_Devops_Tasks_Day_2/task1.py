lst = []
pos = 0
neg = 0
zero = 0

print("Enter 10 numbers")

for i in range(10):
    num = int(input(f"Enter number {i + 1}: "))
    lst.append()
    if num > 0:
        print("Positive number")
        pos += 1
    elif num < 0:
        print("Negative number")
        neg += 1
    else:
        print("Zero")
        zero += 1

print(f"Positive numbers: {pos}")
print(f"Negative numbers: {neg}")
print(f"Zeros: {zero}")