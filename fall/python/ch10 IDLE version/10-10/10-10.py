def reverse_string(x):
    return inputs[::-1]
string = []
i = 'i'
file = open("10-10.txt","r")
while i != '':
    inputs = file.readline()
    i = inputs
    if inputs == '':
        for output in string:
            print (output)
    else:
        inputs = reverse_string(inputs)
        string.append(inputs)
