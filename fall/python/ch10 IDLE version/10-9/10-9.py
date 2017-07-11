def longest_line(line):
    line.append(inputs)
    return line

line = []
i = 'i'
file = open("10-9.txt", "r")

while i != '':
    inputs = file.readline()
    i = inputs
    if inputs == '':
        line = longest_line(line)
        for output in line:
            print (output)
    else:
        if len(inputs) > 5:
            longest_line(line)
            



