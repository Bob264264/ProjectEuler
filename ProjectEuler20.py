def f1(n, prod = 1):
	if n == 1:
		return prod
	while prod %10==0:
		prod/=10
	return f1(n-1, prod*n)

n = f1(100)
sum = 0
while n > 1:
	sum += n%10
	n/=10
print sum