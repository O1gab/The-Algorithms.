import unittest
import math
import sys
sys.path.append('Python/src')
from maths.factorial import factorial, factorial_recursive

class TestFactorialFunction(unittest.TestCase):
    """
    Tests written using unittest
    
    """
    def test_factorial_of_zero(self):
        self.assertEqual(factorial(0), 1)
        self.assertEqual(factorial_recursive(0), 1)

    def test_factorial_of_positive_numbers(self):
        print("5! is equal to ", factorial(5))
        print("5! is equal to ", factorial_recursive(5))
        self.assertEqual(factorial(5), math.factorial(5))
        self.assertEqual(factorial_recursive(5), math.factorial(5))
        
        self.assertEqual(factorial(10), math.factorial(10))
        self.assertEqual(factorial_recursive(10), math.factorial(10))
        print("10! is equal to ", factorial(10))
        print("10! is equal to ", factorial_recursive(10))
        
        self.assertEqual(factorial(9), math.factorial(9))
        self.assertEqual(factorial_recursive(9), math.factorial(9))
        print("9! is equal to ", factorial(9))
        print("9! is equal to ", factorial_recursive(9))
        
        self.assertEqual(factorial(2), math.factorial(2))
        self.assertEqual(factorial_recursive(2), math.factorial(2))
        print("2! is equal to ", factorial(2))
        print("2! is equal to ", factorial_recursive(2))
        
        self.assertEqual(factorial(12), math.factorial(12))
        self.assertEqual(factorial_recursive(12), math.factorial(12))
        print("12! is equal to ", factorial(12))
        print("12! is equal to ", factorial_recursive(12))

    def test_factorial_of_negative_numbers(self):
        with self.assertRaises(ValueError):
            factorial(-5)
            factorial_recursive(-5)
            factorial(-4)
            factorial_recursive(-4)

if __name__ == '__main__':
    unittest.main()