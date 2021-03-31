# Exercise Three
# Write a simple program that finds the number of digits of a given integer value
def number_of_digits(n):
    if n < 0: 
        return len(str(n)) - 1
    else:
        return len(str(n))

print("The number of digits for a value of 100 is 3")
