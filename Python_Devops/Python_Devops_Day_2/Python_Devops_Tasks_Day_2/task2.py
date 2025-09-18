even_nums = []
odd_nums = []

even_sum = 0
odd_sum = 0

print("Enter 10 number")

for i in range(10):
    num = int(input(f"Enter number {i + 1}: "))
    if (num < 0):
        continue
    elif (num % 2 == 0):
        even_sum += num
        even_nums.append(num)
    else:
        odd_sum += num
        odd_nums.append(num)

print(f"Sum of even numbers: {even_sum}")
print(f"Sum of odd numbers: {odd_sum}")