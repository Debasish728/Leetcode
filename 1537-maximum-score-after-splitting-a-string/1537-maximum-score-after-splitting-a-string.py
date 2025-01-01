class Solution:
    def maxScore(self, s: str) -> int:
        score=0
        zeroCount=0
        oneCount = s.count('1')
        for i in range(len(s)-1):
            if s[i] == '0':
                zeroCount+=1
            else:
                oneCount-=1
            score = max(score,(zeroCount+oneCount))
        return score
        