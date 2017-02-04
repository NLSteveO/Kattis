import fileinput
import re


def isNumber(string):
    pattern = re.compile("(\d)+")
    return pattern.match(string)


def sortDictionary(dictionary):
    valueList = []
    while len(dictionary) > 0:
        keys = list(dictionary.keys())
        smallestRadius = min(keys)
        valueList.append(dictionary[smallestRadius])
        del dictionary[smallestRadius]
    return valueList


def main(lines):
    lines.pop(0)
    cups = {}
    for line in lines:
        splitLine = line.split(' ')
        if isNumber(splitLine[0]):
            radius = float(splitLine[0]) / 2
            color = splitLine[1].split('\n')[0]
        else:
            radius = float(splitLine[1])
            color = splitLine[0]
        cups[radius] = color
    cupsColorList = sortDictionary(cups)
    for color in cupsColorList:
        print(color)


if __name__ == '__main__':
    lines = []
    for line in fileinput.input():
        lines.append(line)
    main(lines)
