class Solution:
    def isHappy(self, n: int) -> bool:
        cur_num = n
        seen = set()

        while True:
            new_num = 0
            for digit in str(cur_num):
                new_num += int(digit) ** 2

            if new_num == 1:
                return True
            elif new_num in seen:
                return False
            
            seen.add(new_num)
            cur_num = new_num