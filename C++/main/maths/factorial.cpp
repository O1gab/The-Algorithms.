#include <iostream>
/**
 * Calculates factorial of a number
 *
 * @param x The base number.
 * @param y The exponent.
 * @return The result of raising x to the power y (x^y)
 */

namespace maths
{

    uint64_t factorial(uint8_t n)
    {
        if (n == 0)
        {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

static void tests()
{
    assert(maths::factorial(1) == 1);
    std::cout << "1! equals to " << maths::factorial(1) << std::endl;
    assert(maths::factorial(0) == 1);
    std::cout << "0! equals to " << maths::factorial(0) << std::endl;
    assert(maths::factorial(5) == 120);
    std::cout << "5! equals to " << maths::factorial(5) << std::endl;
    assert(maths::factorial(10) == 3628800);
    std::cout << "10! equals to " << maths::factorial(10) << std::endl;
    assert(maths::factorial(20) == 2432902008176640000);
    std::cout << "20! equals to " << maths::factorial(20) << std::endl;
}

int main()
{
    tests();
    return 0;
}