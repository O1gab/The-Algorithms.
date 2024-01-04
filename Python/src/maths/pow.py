import unittest
import math

"""
Calculates the result of raising x to the power y (x^y)

Tests written with unittest included
"""


"""TO FIX: NEGATIVE Y """

def pow(x: int, y: int) -> int:
    result: int = 1
    
    for i in range(0, y):
        result *= x
        
    return result

def pow_recursive(x: int, y: int) -> int:
    if (y == 0): 
        return 1
    
    return x * pow(x, y - 1)


class TestPowFunction(unittest.TestCase):
    
    def test_power_of_zero(self):
        self.assertEqual(pow(0, 0), 1)
        self.assertEqual(pow_recursive(0, 0), 1)
        self.assertEqual(pow(7, 0), 1)
        self.assertEqual(pow_recursive(7, 0), 1)
        
    def test_power_of_positive_numbers(self):
        self.assertEqual(pow(2, 3), math.pow(2, 3))
        self.assertEqual(pow_recursive(2, 3), math.pow(2, 3))
        self.assertEqual(pow(7, 5), math.pow(7, 5))
        self.assertEqual(pow_recursive(7, 5), math.pow(7, 5))
        self.assertEqual(pow(1, 99), math.pow(1, 99))
        self.assertEqual(pow_recursive(1, 99), math.pow(1, 99))
        self.assertEqual(pow(101, 2), math.pow(101, 2))
        self.assertEqual(pow_recursive(101, 2), math.pow(101, 2))
        
    def test_power_of_negative_numbers(self):
        self.assertEqual(pow(-7, 5), math.pow(-7, 5))
        self.assertEqual(pow_recursive(-7, 5), math.pow(-7, 5))
        self.assertEqual(pow(-1, 5), math.pow(-1, 5))
        self.assertEqual(pow_recursive(-1, 5), math.pow(-1, 5))
        self.assertEqual(pow(-11, 4), math.pow(-11, 4))
        self.assertEqual(pow_recursive(-11, 4), math.pow(-11, 4))
        
        
if __name__ == '__main__':
    unittest.main()