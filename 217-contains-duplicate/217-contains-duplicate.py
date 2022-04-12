class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        dict = {}
        count = 0
        for i in nums:
            if not(dict.has_key(i)):
                dict[i] = i
            else:
                return i == dict[i]
        return False