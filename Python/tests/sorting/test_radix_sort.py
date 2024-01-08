import unittest
import sys
sys.path.append('Python/src')
from sorting.radix_sort import radix_sort

class TestRadixSortFunction(unittest.TestCase):
    """
    Tests written using unittest
    
    """
    def test_empty_list(self):
        self.assertEqual(radix_sort([]), [])

    def test_positive_numbers(self):
        input_list = [170, 45, 75, 90, 802, 24, 2, 66]
        expected_result = [2, 24, 45, 66, 75, 90, 170, 802]
        self.assertEqual(radix_sort(input_list), expected_result)

    def test_negative_numbers(self):
        input_list = [-170, -45, -75, -90, -802, -24, -2, -66]
        expected_result = [-802, -170, -90, -75, -66, -45, -24, -2]
        self.assertEqual(radix_sort(input_list), expected_result)

    def test_mixed_numbers(self):
        input_list = [170, -45, 75, -90, 802, -24, 2, -66]
        expected_result = [-90, -66, -45, -24, 2, 75, 170, 802]
        self.assertEqual(radix_sort(input_list), expected_result)
        
    
if __name__ == '__main__':
    unittest.main()