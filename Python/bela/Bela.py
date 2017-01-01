import fileinput

dominantScores = {'A':11, 'K':4, 'Q':3, 'J':20, 'T':10, '9':14, '8':0, '7':0}
regularScores = {'A':11, 'K':4, 'Q':3, 'J':2, 'T':10, '9':0, '8':0, '7':0}

lines=[]
for line in fileinput.input():
    lines.append(line)

info = lines.pop(0).split()
hands = int(info[0])
dominant = info[1]

score = 0

for line in lines:
    if line[1] == dominant:
        score += dominantScores[line[0]]
    else:
        score += regularScores[line[0]]

print score
