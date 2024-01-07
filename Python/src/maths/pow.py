"""TO FIX: NEGATIVE Y """

def pow(x: int, y: int) -> int:
    """
    Calculates the result of raising x to the power y (x^y)
    
    Args:
    - x (int): The base number.
    - y (int): The exponent.
    
    Returns:
    - int: The result of x raised to the power y.
    """
    result: int = 1
    
    for i in range(0, y):
        result *= x
        
    return result

def pow_recursive(x: int, y: int) -> int:
    if (y == 0): 
        return 1
    
    return x * pow(x, y - 1)