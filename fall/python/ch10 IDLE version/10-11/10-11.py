def reverse_list(inputs):
    templist = str.split(inputs)
    templist.reverse()
    inputs = ' '.join(templist)
    print(inputs)
    return inputs

lst = []
wordlen = 0
i = 'i'
file=open("10-11.txt", "r")

while i != '':
    inputs = file.readline()
    i = inputs
    if inputs == '':
        print("Word count: ",wordlen)
        (exit)
    else:
        reverse_list(inputs)
        wordlen = wordlen + len(str.split(inputs))
        lst.append(inputs)
        
