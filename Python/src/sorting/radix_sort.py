def radix_sort(array):
    """
    Implementation of the Radix Sort Algorithm
    
    Args:
    - array (list): A list of integers (positive and negative) to be sorted.

    Returns:
    - list: A sorted list of integers.
    
    Radix Sort Algorithm:
    - Radix Sort sorts integers by processing individual digits starting from the least significant 
    digit to the most significant digit. 
    - It utilizes Counting Sort as a subroutine for sorting each digit at different positions.

    Time Complexity:
    - Best Case: O(n * k) where 'n' is the number of elements and 'k' is the number of digits in the largest element.
    - Average Case: O(n * k)
    - Worst Case: O(n * k)

    """
    pos = [x for x in array if x >= 0]
    neg = [-x for x in array if x < 0]

    if pos:
        max_pos = max(pos)
    else:
        max_pos = 0

    if neg:
        max_neg = max(neg)
    else:
        max_neg = 0

    max_val = max(max_pos, max_neg)
    exp = 1
    while max_val // exp > 0:
        counting_sort(neg, exp)
        counting_sort(pos, exp)
        exp *= 10

    neg = [-x for x in neg[::-1]]
    neg.extend(pos)
    return neg

def counting_sort(array, exp):
    """
    Helper method that performs a counting sort based on the digit represented by exp.
    
    Args:
    - array (list): The list to be sorted.
    - exp (int): The digit position to sort by.

    Returns:
    - list: The sorted list based on the specified digit position.
    """
    n = len(array)
    output = [0] * n
    count = [0] * 10

    for i in range(n):
        index = (array[i] // exp) % 10
        count[index] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = n - 1
    while i >= 0:
        index = (array[i] // exp) % 10
        output[count[index] - 1] = array[i]
        count[index] -= 1
        i -= 1

    for i in range(n):
        array[i] = output[i]
        

if __name__ == "__main__":
    # Some examples:
    array = [170, 45, 75, 90, 802, 24, 2, 66]
    print("List before sorting:", array)

    sorted_array = radix_sort(array)
    print("List after sorting:", sorted_array)
    
    array = [3, 242, 191919, -82825, 2049, 4929, 0, 0, 0, 1]
    print("List before sorting:", array)

    sorted_array = radix_sort(array)
    print("List after sorting:", sorted_array)