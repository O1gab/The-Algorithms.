import unittest
import math
"""
Calculates factorial of number n (n!)

Tests written with unittest included
"""

def factorial(number: int) -> int:
    if (number < 0):
        raise ValueError("Number cannot be negative!")
    result : int = 1

    for i in range (number, 1, -1):
        result *= i
    
    return result

def factorial_recursive(number: int) -> int:
    if (number < 0):
        raise ValueError("Number cannot be negative!")
    if number in (0, 1):
        return 1
    return number * factorial_recursive(number - 1)

