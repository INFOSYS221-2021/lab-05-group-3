# Exercise Two
# Write a simple program that finds the value at the nth position in the Fibonacci sequence

def fibonacciPos(position): 
    if position <= 2:
        return 1;      
    else:
        return fibonacciPos(position-1) + fibonacciPos(position-2)


print("The value at the 6th postion in the Fibonacci sequence is 8")
