class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        map={}
        for i,num in enumerate(nums):
            complement = target-num
            if complement in map:
                return[map[complement],i]
            map[num]=i
        return map  