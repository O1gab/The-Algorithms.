import unittest
import random
import sys
sys.path.append('Python/src')
from searching.binary_search import binary_search, binary_search_recursive

class TestBinarySearchFunction(unittest.TestCase):
    
    def test_existing_value(self):
        array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        value = 5
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {binary_search(array, value)}")
        self.assertEqual(binary_search(array, 5), 4)
        self.assertEqual(binary_search_recursive(array, 5), 4)
        
        
        array = [7]
        value = 7
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {binary_search(array, value)}")
        self.assertEqual(binary_search(array, 7), 0)
        self.assertEqual(binary_search_recursive(array, 7), 0)
        
        array = list(range(1, 1001))
        value = 750
        self.assertEqual(binary_search(array, value), 749)
        self.assertEqual(binary_search_recursive(array, value), 749)
        
    def test_non_existing_value(self):
        array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        value = 11
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {binary_search(array, value)}")
        print(f"Oops! The searched value is not in array")
        self.assertEqual(binary_search(array, 11), -1)
        self.assertEqual(binary_search_recursive(array, 11), -1)
        
    def test_empty_array(self):
        array = []
        value = 5
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {binary_search(array, value)}")
        print(f"Oops! The searched value is not in array")
        self.assertEqual(binary_search(array, 5), -1) 
        self.assertEqual(binary_search_recursive(array, 5), -1)
        
        value = 0
        print(f"We are searching for {value} in {array}")
        print(f"Index of the value is {binary_search(array, value)}")
        print(f"Oops! The searched value is not in array")
        self.assertEqual(binary_search(array, 0), -1) 
        self.assertEqual(binary_search_recursive(array, 0), -1)
    
        
if __name__ == '__main__':
    unittest.main()