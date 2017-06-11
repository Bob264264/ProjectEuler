def value(str):
	sum = 0
	for x in str:
		sum += ord(x) - 64
	return sum;

f = open("../Downloads/p022_names.txt", 'r')
names = sorted(f.read().split(','))
sum = 0
for x in names:
	sum += (names.index(x)+1) * value(x[1:-1])
print sum