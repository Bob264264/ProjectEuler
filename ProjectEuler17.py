def count(i):
	sum = 0
	if i > 999: sum += l("onethousand")
	if (i%1000)/100 > 0:
		if i%100 > 0: sum += l("and")
		sum += l("hundred") + l(nums[i/100])
	if i%100 < 20: sum += l(nums[i%100])
	else: sum += l(tens[(i%100)/10]) + l(nums[i%10])
	return sum	

nums = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
		"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
tens = ["", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]
l = len
sum = 0
bigL = 0
bigN = 0
print count(input())
for i in range(1, 1001):
	sum += count(i)
	if count(i) > bigL: 
		bigL = count(i)
		bigN = i
print sum, bigN, bigL

