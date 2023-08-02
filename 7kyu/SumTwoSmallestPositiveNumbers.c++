#include <vector>
#include <iostream>
#include <limits>
long sumTwoSmallestNumbers(std::vector<int> numbers)
{
  long lowest1 = std::numeric_limits<int>::max();
    long lowest2 = std::numeric_limits<int>::max();

    std::cout << std::endl;
    for ( long num : numbers) {
        if (num > 0) {
            if (num < lowest1) {
                lowest2 = lowest1;
                lowest1 = num;
            } else if (num < lowest2) {
                lowest2 = num;
            }
        }
    }

    // Return the sum of the two lowest positive numbers
    return lowest1 + lowest2;
}