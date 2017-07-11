def reverse_list(lst):
    l1 = lst[0]
    l2 = lst[1]
    l3 = lst[2]
    l4 = lst[3]
    lst[0] = l4
    lst[1] = l3
    lst[2] = l2
    lst[3] = l1
    return lst
lst = []
i = 'i'
file = open("10-8.txt","r")
while i != '':
    inputs = file.readline()
    i = inputs
    if inputs == '':
        lst = reverse_list(lst)
        for output in lst:
            print (output)
    else:
        lst.append(inputs)
