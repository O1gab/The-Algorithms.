def bubble_sort(array):
    """
    Implementation of the Bubble Sort Algorithm
    
    Args:
    - array (list): A list of elements to be sorted.

    Returns:
    - list: A sorted list of elements.
    
    Binary Search Algorithm:
    - This algorithm repeatedly steps through the list, compares adjacent elements, and 
    swaps them if they are in the wrong order. 
    - The process is repeated until the entire list is sorted.
    
    Time Complexity:
    - Best Case: O(n) - When the input list is already sorted.
    - Average Case: O(n^2) - For random input lists.
    - Worst Case: O(n^2) - When the input list is reverse sorted.
    
    """
    n = len(array)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if array[j] > array[j + 1]:
                # Swap array[j] and array[j+1]
                array[j], array[j + 1] = array[j + 1], array[j]
    return array

if __name__ == "__main__":
    # Some examples
    array = [64, 34, 25, 12, 22, 11, 90]
    print("Array before sorting:", array)

    sorted_array = bubble_sort(array)
    print("Array after sorting:", sorted_array)
    
    array = [3, 242, -191919, 82825, 2049, 4929, 0, 0, 0, 1]
    print("Array before sorting:", array)

    sorted_array = bubble_sort(array)
    print("Array after sorting:", sorted_array)