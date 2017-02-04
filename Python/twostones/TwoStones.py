import fileinput

lines = []
for line in fileinput.input():
    lines.append(line)

for line in lines:
    if int(line) % 2 == 0:
        print("Bob")
    else:
        print("Alice")
