class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        balance = {}
        for c in s:
            balance[c] = balance.get(c, 0) + 1
        
        for c in t:
            balance[c] = balance.get(c, 0) - 1
        
        for val in balance.values():
            if val != 0:
                return False
        
        return True