import unittest
import sys
sys.path.append('Python/src')
from sorting.bubble_sort import bubble_sort

class TestBubbleSortFunction(unittest.TestCase):
    """
    Tests written using unittest
    
    """
    def test_empty_list(self):
        self.assertEqual(bubble_sort([]), [])

    def test_already_sorted_list(self):
        self.assertEqual(bubble_sort([1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(bubble_sort([10, 50, 70, 100, 210]), [10, 50, 70, 100, 210])

    def test_reverse_sorted_list(self):
        self.assertEqual(bubble_sort([5, 4, 3, 2, 1]), [1, 2, 3, 4, 5])
        self.assertEqual(bubble_sort([210, 100, 70, 50, 10]), [10, 50, 70, 100, 210])
        

    def test_random_list(self):
        self.assertEqual(bubble_sort([64, 34, 25, 12, 22, 11, 90]), [11, 12, 22, 25, 34, 64, 90])

    def test_list_with_duplicates(self):
        self.assertEqual(bubble_sort([5, 3, 2, 5, 1, 3, 2]), [1, 2, 2, 3, 3, 5, 5])
        self.assertEqual(bubble_sort([3, 3, 3, 3, 3, 3, 3]), [3, 3, 3, 3, 3, 3, 3])


if __name__ == '__main__':
    unittest.main()