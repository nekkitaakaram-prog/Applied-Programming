class Solution(object):
    #def maxProfit(self, prices):
        #max1 = 0
        #for i in range(1, len(prices)):
            #buy = min(prices[:i])
            #curr_max = prices[i] - buy   # ✅ FIX
            #if curr_max > max1:
                #max1 = curr_max
        #return max1# this one wont work for large input because that slicing creates new array

    def maxProfit(self, prices):
        maxprofit=0
        min_buy=prices[0]
        for i in range(1,len(prices)):
          profit=prices[i]-min_buy
          maxprofit=max(maxprofit,profit)
          min_buy=min(min_buy,prices[i])
        return maxprofit
