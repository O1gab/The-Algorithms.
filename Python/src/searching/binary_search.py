def binary_search(array, value):
    """
    The binary search algorithm that finds the index of a value in a sorted array.
    
    Args:
    - array (list): A sorted list of elements (integers, floats, etc.).
    - value: The value to search for in the array.
    
    Returns:
    - int: The index of the value in the array if found, otherwise -1.
    
    Binary search algorithm:
    1. Initialize left and right pointers.
    2. While left pointer is less than or equal to right pointer:
        a. Calculate middle index.
        b. If value is found at middle index, return index.
        c. If value is greater, search in the right half of the array.
        d. If value is smaller, search in the left half of the array.
    3. If value is not found, return -1.
    
    Complexity:
    - Time: O(log n) where n is the number of elements in the array.
    - Space: O(1) (constant space complexity).
    
    """

    left, right = 0, len(array) - 1

    while left <= right:
        middle = left + (right - left) // 2

        if array[middle] == value:
            return middle
        elif array[middle] < value:
            left = middle + 1
        else:
            right = middle - 1

    return -1 



def binary_search_recursive(array, value):
    """
        Recursive method for binary search.
        
        Args:
        - array (list): A sorted list of elements (integers, floats, etc.).
        - value: The value to search for in the array.
        
        Returns:
        - int: The index of the value in the array if found, otherwise -1.
        """
    return search_recursive(array, value, 0, len(array) - 1)
    
    
def search_recursive (array, value, left, right):
        """
        Recursive helper function for binary search.
        
        Args:
        - array (list): A sorted list of elements (integers, floats, etc.).
        - value: The value to search for in the array.
        - left (int): Left boundary index for the search.
        - right (int): Right boundary index for the search.
        
        Returns:
        - int: The index of the value in the array if found, otherwise -1.
        """

        if left > right:
            return -1  # Base case: Element not found

        middle = left + (right - left) // 2

        if array[middle] == value:
            return middle  # Element found at mid index
        elif array[middle] < value:
            return search_recursive(array, value, middle + 1, right)  # Search in the right half
        else:
            return search_recursive(array, value, left, middle - 1)  # Search in the left half
        


if __name__ == "__main__":
    # Example with array of integers
    array = [1, 2, 3, 5, 7, 9, 27]
    value = 7

    print(f"We are searching for {value} in {array}")
    print(f"Index of the value is {binary_search(array, value)}")
    print(f"We are searching for {value} in {array}")
    print(f"Index of the value is {binary_search_recursive(array, value)}")

    # if array does not contain the value
    value = 19
    print(f"We are searching for {value} in {array}")
    print(f"Index of the value is {binary_search(array, value)}")
    print(f"We are searching for {value} in {array}")
    print(f"Index of the value is {binary_search_recursive(array, value)}")