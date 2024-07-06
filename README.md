# Best-Time-to-Buy-and-Sell-Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


 My thought process, in a way I can best describe it in written form.
 I wanted to solve this problem using log(n) time complexity because 
 log(n^2) is quite easy to replicate.

 I started by thinking of the meaning profit
 profit = Highestsell - Lowestbuy;
 think that you want to sell your goods at the highest price possible while buying it at the lowest price possible.
 that last day to sell is the last index of the price, so traverse the array backwardly
 instatiating Highestsell = to last element
 therefore you must also instatiate  lowestBuy to the day before you sell so
 Lowestbuy = element before the last element.
 traverse the array looking for the highest number and set it to Highestsell, anytime you update Highestsell
 you must also update Lowestbuy to the day/element before Highestsell.
 if you don't find a big number to replace Highestsell, find a small number to replace Lowestbuy.
 anytime you update Highestsell or Lowestbuy, keep track of maxProfit and return it.
 There are edgeCases where the array has only one element, since you can only buy and not sell it at lower price you return o.

 what helped me solve this:
 Don't overwhelm yourself with online information, think about the problem before you look for a solution.
 Remove distractions: loud friends or being on your phone.
 Use the discussion panel on LeetCode to understand the problem not the solution, sometimes we have the answer we think someone else has.
 play some low sweet christian lofi music-  this really help me alot. Suggestion: I surrender All by LoFi Hymnal.
 Take what is of use and Happy coding!
 
