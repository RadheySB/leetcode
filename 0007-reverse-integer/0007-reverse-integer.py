class Solution:
    def reverse(self, x: int) -> int:
        min = -2**31
        max = 2**31 - 1

        s = str(abs(x))
        rev = int(s[::-1])

        if x < 0:
            rev = -rev

        if rev < min or rev > max:
            return 0

        return rev