import fileinput

# Takes a line "[animal] goes [sound]" and returns the sound of the animal
# (example line: "dog goes woof")
def getSound(animal):
    start = animal.find('goes') + 4
    end = len(animal)
    return animal[start:end-1]

# Removes the excess spaces in the string of remaining sounds
def cleanSpaces(line):
    while line.find('  ') > -1:
        line = line.replace('  ', ' ')
    return line.strip()

# Takes a sub-list starting with the string of sounds, followed by up to
# 100 lines of "[animal] goes [sound]"
def whatDoesTheFoxSay(list):
    sounds = list.pop(0)
    sounds = ' ' + sounds
    for animal in list:
        sound = getSound(animal)
        sounds = sounds.replace(sound, '')
    print cleanSpaces(sounds)

# Read in from std.in and store each line into an array
lines=[]
for line in fileinput.input():
    lines.append(line)

# Get the number of test cases, set the start and end of the first test case
tests = int(lines.pop(0))
testStart = 0
testEnd = lines.index('what does the fox say?\n')

while tests > 0:
    whatDoesTheFoxSay(lines[testStart:testEnd])
    if tests > 1:
        # Update the start and end of following test cases
        testStart = testEnd + 1
        testEnd = lines.index('what does the fox say?\n', testStart)
    tests = tests - 1
