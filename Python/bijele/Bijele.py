import fileinput

numberOfPieces = {'Kings': 1, 'Queens': 1, 'Rooks': 2, 'Bishops': 2, 'Knights': 2, 'Pawns': 8}

lines=[]
for line in fileinput.input():
    lines.append(line)

lines = lines[0].split()
answer = ''

for i in range(0, len(lines)):
    if i == 0:
        answer += str(numberOfPieces['Kings'] - int(lines[i])) + ' '
    elif i == 1:
        answer += str(numberOfPieces['Queens'] - int(lines[i])) + ' '
    elif i == 2:
        answer += str(numberOfPieces['Rooks'] - int(lines[i])) + ' '
    elif i == 3:
        answer += str(numberOfPieces['Bishops'] - int(lines[i])) + ' '
    elif i == 4:
        answer += str(numberOfPieces['Knights'] - int(lines[i])) + ' '
    else:
        answer += str(numberOfPieces['Pawns'] - int(lines[i]))
print answer
