import fileinput

lines=[]
for line in fileinput.input():
    lines.append(line)

lines = lines[0].split()

fizz = int(lines[0])
buzz = int(lines[1])
endCount = int(lines[2])

for i in range(1, endCount + 1):
    if i%fizz == 0 and i%buzz == 0:
        print 'FizzBuzz'
    elif i%fizz == 0:
        print 'Fizz'
    elif i%buzz == 0:
        print 'Buzz'
    else:
        print i
