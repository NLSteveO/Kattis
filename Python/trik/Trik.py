import fileinput

def trik(li):
    moves = li[0].split()[0]
    for x in moves:
        moveBall(x)
    print ball

def moveBall(move):
    global ball
    if move == 'A':
        if ball == 1:
            ball = 2
        elif ball == 2:
            ball = 1
    elif move == 'B':
        if ball == 2:
            ball = 3
        elif ball == 3:
            ball = 2
    elif move == 'C':
        if ball == 1:
            ball = 3
        elif ball == 3:
            ball = 1

lines=[]
for line in fileinput.input():
    lines.append(line)
ball = 1
trik(lines)
