class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        nl = []
        for i in nums:
            nl.append(i)
        for i in nl:
            if i == val:
                nums.remove(val)
        return len(nums)