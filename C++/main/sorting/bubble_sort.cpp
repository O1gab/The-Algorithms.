#include <iostream>
#include <vector>
#include <cassert>

namespace sorting
{
    template <typename T>
    void bubble_sort(std::vector<T> &arr)
    {
        int n = arr.size();
        for (int i = 0; i < n - 1; ++i)
        {
            for (int j = 0; j < n - i - 1; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap arr[j] and arr[j+1]
                    std::swap(arr[j], arr[j + 1]);
                }
            }
        }
    }
}

static void tests()
{
    // Test case 1: Sorting a vector of integers
    std::vector<int> intArray;
    intArray.push_back(64);
    intArray.push_back(34);
    intArray.push_back(25);
    intArray.push_back(12);
    intArray.push_back(22);
    intArray.push_back(11);
    intArray.push_back(90);

    std::vector<int> expectedIntArray;
    expectedIntArray.push_back(11);
    expectedIntArray.push_back(12);
    expectedIntArray.push_back(22);
    expectedIntArray.push_back(25);
    expectedIntArray.push_back(34);
    expectedIntArray.push_back(64);
    expectedIntArray.push_back(90);

    sorting::bubble_sort(intArray);
    assert(intArray == expectedIntArray);

    // Test case 2: Sorting a vector of doubles
    std::vector<double> doubleArray;
    doubleArray.push_back(3.14);
    doubleArray.push_back(1.2);
    doubleArray.push_back(9.8);
    doubleArray.push_back(4.5);
    doubleArray.push_back(2.71);

    std::vector<double> expectedDoubleArray;
    expectedDoubleArray.push_back(1.2);
    expectedDoubleArray.push_back(2.71);
    expectedDoubleArray.push_back(3.14);
    expectedDoubleArray.push_back(4.5);
    expectedDoubleArray.push_back(9.8);

    sorting::bubble_sort(doubleArray);
    assert(doubleArray == expectedDoubleArray);

    // Test case 3: Sorting an empty vector
    std::vector<int> emptyArray;
    std::vector<int> expectedEmptyArray;

    sorting::bubble_sort(emptyArray);
    assert(emptyArray == expectedEmptyArray);
}

int main()
{
    tests();
    return 0;
}