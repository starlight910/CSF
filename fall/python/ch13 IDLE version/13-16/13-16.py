def lst_words(txt):
     txt = txt.strip()
     words.append(txt)
     
     return words

words = []
aegln = []
aemst = []
eerst = []
ccklo = []

i = 'i'
file = open('13-16.txt','r')

while i != '':
     txt = file.readline()
     i = txt

     words = lst_words(txt)

     if txt == '':
          exit

for word in words:
     if sorted(word) == ['a','e','g','l','n']:
         aegln.append(word)
     if sorted(word) == ['a','e','m','s','t']:
         aemst.append(word)
     if sorted(word) == ['e','e','r','s','t']:
         eerst.append(word)
     if sorted(word) == ['c','c','k','l','o']:
         ccklo.append(word)
         

print(tuple(aegln))
print(tuple(aemst))
print(tuple(eerst))
print(tuple(ccklo))
