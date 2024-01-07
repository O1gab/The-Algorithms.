#include <iostream>
/**
 * Calculates the power of a number (x^y) using iterative method.
 *
 * @param x The base number.
 * @param y The exponent.
 * @return The result of raising x to the power y (x^y)
 */
long pow(int x, int y)
{
    long result = 1;
    for (int i = 0; i < y; i++)
    {
        result *= x;
    }
    return result;
}
/**
 * Calculates the power of a number (x^y) using recursive method.
 *
 * @param x The base number.
 * @param y The exponent.
 * @return The result of raising x to the power y (x^y)
 */
long pow_recursive(int x, int y)
{
    if (y == 0)
        return 1;
    return x * pow_recursive(x, y - 1);
}

int main()
{
    // Some examples:

    int base = 2;
    int exponent = 3;
    std::cout << " Iterative Power: " << pow(base, exponent) << std::endl;
    std::cout << "Recursive Power: " << pow_recursive(base, exponent) << std::endl;

    base = 10;
    exponent = 5;
    std::cout << "Iterative Power: " << pow(base, exponent) << std::endl;
    std::cout << "Recursive Power: " << pow_recursive(base, exponent) << std::endl;

    base = 27;
    exponent = 5;
    std::cout << "Iterative Power: " << pow(base, exponent) << std::endl;
    std::cout << "Recursive Power: " << pow_recursive(base, exponent) << std::endl;
    return 0;
}