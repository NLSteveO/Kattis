import fileinput

lines=[]
for line in fileinput.input():
	lines.append(line)

count = lines.pop(0)
sum = 0
for line in lines:
	pow = int(line[len(line)-2])
	base = int(line[0:len(line)-2])
	sum += base**pow

print sum
