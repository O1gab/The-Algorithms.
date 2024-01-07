import unittest
import sys
sys.path.append('Python/src')
from searching.linear_search import linear_search

class TestLinearSearchFunction(unittest.TestCase):
    """
    Tests written using unittest
    
    """
    def test_existing_value(self):
        array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        value = 5
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {linear_search(array, value)}")
        self.assertEqual(linear_search(array, 5), 4)
        
        array = [7]
        value = 7
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {linear_search(array, value)}")
        self.assertEqual(linear_search(array, 7), 0)
        
        array = list(range(1, 1001))
        value = 750
        self.assertEqual(linear_search(array, value), 749)
        
    def test_non_existing_value(self):
        array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        value = 11
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {linear_search(array, value)}")
        print(f"Oops! The searched value is not in array")
        self.assertEqual(linear_search(array, 11), -1)
        
    def test_empty_array(self):
        array = []
        value = 5
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {linear_search(array, value)}")
        print(f"Oops! The searched value is not in array")
        self.assertEqual(linear_search(array, 5), -1) 
        
        value = 0
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {linear_search(array, value)}")
        print(f"Oops! The searched value is not in array")
        self.assertEqual(linear_search(array, 0), -1) 
    
        
if __name__ == '__main__':
    unittest.main()