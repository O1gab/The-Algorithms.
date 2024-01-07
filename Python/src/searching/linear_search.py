def linear_search(array, value):
    """
    The linear search algorithm that finds the index of a value in an array
    
    Args:
    - array (list): A sorted list of elements (integers, floats, etc.).
    - value: The value to search for in the array.
    
    Returns:
    - int: The index of the value in the array if found, otherwise -1.
    
    Linear Search Algorithm:
    1. Iterate through each element in the array.
    2. If the current element matches the value, return its index.
    3. If the value is not found, return -1.
    
    Complexity:
    - Time: O(n) where n is the number of elements in the array.
    - Space: O(1) (constant space complexity).
    
    """
    for i in range(len(array)):
        if (array[i] == value):
            return i
    return -1

if __name__ == "__main__":
    # Example with array of integers
    array = [1, 2, 3, 5, 7, 9, 27]
    value = 7

    print(f"We are searching for {value} in {array}")
    print(f"Index of the value is {linear_search(array, value)}")
    
    # if array does not contain the value
    value = 59
    print(f"We are searching for {value} in {array}")
    print(f"Index of the value is {linear_search(array, value)}")
        