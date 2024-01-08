#include <iostream>
#include <cassert>

namespace searching
{
    int linear_search(int array[], int value)
    {
        int index = 0;
        while (array[index] != -1)
        {
            if (array[index] == value)
            {
                return index;
            }
            index++;
        }
        return -1;
    }
}

static void tests()
{
    int testArray1[] = {12, 45, 67, 89, 34, 56, -1};
    int testArray2[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, -1};
    int testArray3[] = {55, 44, 33, 22, 11, -1};

    int value1 = 67;
    int value2 = 18;
    int value3 = 50;

    assert(searching::linear_search(testArray1, value1) == 2);
    assert(searching::linear_search(testArray2, value2) == 5);
    assert(searching::linear_search(testArray3, value3) == -1);
}

int main()
{
    tests();
    std::cout << "All tests passed successfully!" << std::endl;
    return 0;
}