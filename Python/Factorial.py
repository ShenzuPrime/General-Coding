def main():
    n = (input("Enter a non-negative integer: "))
    print('Factorial of', n, 'is', factorial(n))
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)
main() # Call the main function
