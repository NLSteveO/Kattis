import fileinput

for line in fileinput.input():
    splitLine = line.split()
    a = splitLine[0]
    b = splitLine[1]
    c = int(a) - int(b)
    print(abs(c))
