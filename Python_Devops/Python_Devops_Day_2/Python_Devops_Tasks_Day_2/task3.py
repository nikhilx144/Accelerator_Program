count_A = 0
count_B = 0
count_C = 0
count_Fail = 0

for i in range(5):
    marks = int(input(f"Enter marks of subject {i + 1}: "))
    if marks > 100:
        break
    elif marks >= 90:
        count_A += 1
        print("Grade A")
    elif marks >= 75:
        count_B += 1
        print("Grade B")
    elif marks >= 50:
        count_C += 1
        print("Grade C")
    else:
        count_Fail += 1
        print("Fail")

print(f"Number of A grades: {count_A}")
print(f"Number of B grades: {count_B}")
print(f"Number of C grades: {count_C}")
print(f"Number of Fails: {count_Fail}")