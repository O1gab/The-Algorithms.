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



class TestFactorialFunction(unittest.TestCase):
    def test_factorial_of_zero(self):
        self.assertEqual(factorial(0), 1)
        self.assertEqual(factorial_recursive(0), 1)

    def test_factorial_of_positive_numbers(self):
        self.assertEqual(factorial(5), math.factorial(5))
        self.assertEqual(factorial_recursive(5), math.factorial(5))
        self.assertEqual(factorial(10), math.factorial(10))
        self.assertEqual(factorial_recursive(10), math.factorial(10))
        self.assertEqual(factorial(9), math.factorial(9))
        self.assertEqual(factorial_recursive(9), math.factorial(9))
        self.assertEqual(factorial(2), math.factorial(2))
        self.assertEqual(factorial_recursive(2), math.factorial(2))
        self.assertEqual(factorial(12), math.factorial(12))
        self.assertEqual(factorial_recursive(12), math.factorial(12))

    def test_factorial_of_negative_numbers(self):
        with self.assertRaises(ValueError):
            factorial(-5)
            factorial_recursive(-5)
            factorial(-4)
            factorial_recursive(-4)

if __name__ == '__main__':
    unittest.main()