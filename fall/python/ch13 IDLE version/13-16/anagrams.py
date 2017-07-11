def lst_words(txt):
     txt = txt.strip()
     words.append(txt)
     
     return words

words = []

lst1 = []
lst2 = []
lst3 = []
lst4 = []

i = 'i'
file = open('medium_list_for_anagrams.txt','r')

while i != '':
     txt = file.readline()
     i = txt

     words = lst_words(txt)
     if txt == '':
          exit

for word in words:
     if sorted(word) == ['c','d','e','e','i','r','s','t']:
         lst1.append(word)
     if sorted(word) == ['a','e','l','r','t']:
         lst2.append(word)
     if sorted(word) == ['h','n','o','p','t','y']:
         lst3.append(word)
     if sorted(word) == ['e','e','g','n','r']:
         lst4.append(word)
         

print(tuple(lst1))
print(tuple(lst2))
print(tuple(lst3))
print(tuple(lst4))
