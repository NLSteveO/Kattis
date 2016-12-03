import fileinput
from collections import Counter

lines=[]
for line in fileinput.input():
    lines.append(line)

lines = lines[0].split()

dieOne = int(lines[0])
dieTwo = int(lines[1])

outcomes = []
for i in range(1, dieOne+dieTwo):
    outcomes.append(0)
for i in range(1, dieOne):
    for j in range(1, dieTwo):
        outcomes[i+j] = outcomes[i+j] + 1

maxOutcomes = max(outcomes)
for i in range(0, dieOne+dieTwo-1):
    if outcomes[i] == maxOutcomes:
        print i+1
