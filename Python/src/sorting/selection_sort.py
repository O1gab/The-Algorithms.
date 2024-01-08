def selection_sort(array):
    """
    Implementation of the Selection Sort Algorithm
    
    Args:
    - array (list): A list of elements to be sorted.

    Returns:
    - list: A sorted list of elements.
    
    Selection Sort Algorithm:
    - This algorithm divides the input list into two parts: a sorted sublist and an unsorted sublist.
    - It repeatedly finds the smallest element from the unsorted sublist and swaps it with the first 
    unsorted element, growing the sorted sublist. 
    - The process continues until the entire list is sorted.
    
    Time Complexity:
    - Best Case: O(n^2) - For all cases, as it always performs nested iterations through the list.
    - Average Case: O(n^2) - For random input lists.
    - Worst Case: O(n^2) - For all cases.

    """
    n = len(array)
    for i in range(n - 1):
        min_index = i
        for j in range(i + 1, n):
            if array[j] < array[min_index]:
                min_index = j
        array[i], array[min_index] = array[min_index], array[i]
    return array

if __name__ == "__main__":
    # Some examples
    array = [64, 34, 25, 12, 22, 11, 90]
    print("List before sorting:", array)

    sorted_array = selection_sort(array)
    print("List after sorting:", sorted_array)
    
    array = [3, 242, -191919, 82825, 2049, 4929, 0, 0, 0, 1]
    print("List before sorting:", array)

    sorted_array = selection_sort(array)
    print("List after sorting:", sorted_array)