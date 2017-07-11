#Authorship Project CSF Evergreen Fall 2016
#programmers = ['Tim Aston', 'Jesse Hasselswerth', 'Ron Holms', 'Jun Ho Lim', 'Justtin Speer']

import os.path, math
import re

def clean_up(s):
    ''' Return a version of string s in which all letters have been
    converted to lowercase and punctuation characters have been stripped 
    from both ends. Inner punctuation is left untouched. '''
    
    punctuation = '''!"',;:.-?)([]<>*#\n\t\r'''
    result = s.lower().strip(punctuation)

    return result

def list_clean_up(l):
    str_split = []
    for i in l:
        str_split.append(clean_up(i))
    return str_split


def average_word_length(text):
    ''' Return the average length of all words in text. Do not
    include surrounding punctuation in words. 
    text is a non-empty list of strings each ending in \n.
    At least one line in text contains a word.'''

    str_split = []
    sums = 0
    for i in text:
        temp = i.split()
        for i in temp:
            clean = clean_up(i)
            str_split.append(clean)
            sums += len(clean)
        
    return (sums / len(str_split))
    


def type_token_ratio(text):
    ''' Return the type token ratio (TTR) for this text.
    TTR is the number of different words divided by the total number of words.
    text is a non-empty list of strings each ending in \n.
    At least one line in text contains a word. '''

    unique_word_list = []
    all_words_list = []
    for i in text:
        temp = i.split()
        for i in temp:
            clean = clean_up(i)
            all_words_list.append(i)
            if i not in unique_word_list:
                unique_word_list.append(i)
    #average = ((len(unique_word_list) / len(all_words_list))/2)
    average = (len(unique_word_list) / len(all_words_list))
    
    # To do: Replace this function's body to meet its specification.
    #return (len(unique_word_list) / len(all_words_list))
    return average
                
def hapax_legomana_ratio(text):
    ''' Return the hapax_legomana ratio for this text.
    This ratio is the number of words that occur exactly once divided
    by the total number of words.
    text is a list of strings each ending in \n.
    At least one line in text contains a word.'''

    all_words_list = []
    one_time_word = []
    for i in text:
        temp = i.split()
        for i in temp:
            clean = clean_up(i)
            all_words_list.append(clean)
    for word in all_words_list:
        if all_words_list.count(word) == 1:
            one_time_word.append(word)

    #print(all_words_list)
    #print(one_time_word)

    Average = (len(one_time_word) / len(all_words_list))      
    #Average = ((len(one_time_word) / len(all_words_list))/2)      

    
    #print('ratio',temp)
       
    return Average
    # To do: Replace this function's body to meet its specification.
    #return (len(one_time_word) / len(all_words_list))


    
def average_sentence_length(text):
    ''' Return the average number of words per sentence in text.
    text is guaranteed to have at least one sentence.
    Terminating punctuation defined as !?.
    A sentence is defined as a non-empty string of non-terminating
    punctuation surrounded by terminating punctuation
    or beginning or end of file. '''

    

    sentences = []
    count = 0
    new_text = ""
    #print("text =", text)
    for s in text:
        new_text += s

    temp = re.split('[!\?\.]', new_text)
    #print("new_text =", new_text)

    for s in temp:
        clean_s = ""
        new_s = s.strip('\n')
        if new_s != '':
            #print("new_s =", new_s)
            string_split = new_s.split()
            for w in string_split:
                #print("w =", w)
                clean_s += ' ' + clean_up(w)
            #print("clean_s =", clean_s)
            sentences.append(clean_s)

    for i in sentences:
        count += len(i.split())

    #print(count / len(sentences))

    return (count / len(sentences))


def avg_sentence_complexity(text):
    '''Return the average number of phrases per sentence.
    Terminating punctuation defined as !?.
    A sentence is defined as a non-empty string of non-terminating
    punctuation surrounded by terminating punctuation
    or beginning or end of file.
    Phrases are substrings of a sentences separated by
    one or more of the following delimiters ,;: '''
    #Take text from the file and break it into sentances

    #print('more before:', text)
    
    sentences = []
    count = 0
    new_text = ""
    #print("text =", text)
    for s in text:
        new_text += s

    temp = re.split('[!\?\.]', new_text)

    for s in temp:
        clean_s = ""
        new_s = s.strip('\n')
        if new_s != '':
            #print("new_s =", new_s)
            string_split = new_s.split()
            for w in string_split:
                #print("w =", w)
                clean_s += ' ' + clean_up(w)
            #print("clean_s =", clean_s)
            sentences.append(clean_s)
            
    # To do: Replace this function's body to meet its specification.
    #return the number of phrases devided by the number of sentances. I don't know if this is the right way to find the average complexity though.

    phrases = []
    phrase_count = 0
    sentence_count = 0
    new_text = ""
    for s in text:
        new_text += s

    sentence = re.split('[!\?\.]', new_text)

    for s in sentence:
        phrase = re.split('[,\;\:]', s)
        phrases = []
        for p in phrase:
            phrases.append(clean_up(p))
        if ((len(phrases) != 1) and (phrases[0] != "")):
            phrase_count += len(phrase)
            sentence_count += 1

    #print (phrase_count / sentence_count)
    return (phrase_count / sentence_count)


    
    
def get_valid_filename(prompt):
    '''Use prompt (a string) to ask the user to type the name of a file. If
    the file does not exist, keep asking until they give a valid filename.
    The filename must include the path to the file.
    Return the name of that file.'''
    
    # To do: Complete this function's body to meet its specification.
    # use: print ("That file does not exist: " + filename)

    '''This loop will prompt the user for a file name, if the file is in the current directory of the program.
    If the file is the name of a file name it will exit and run the rest of the program.
    if it is not a file name it will keep asking the user for another file name.'''
    i = 0
    while i != 1:
        filename = input(prompt)
        if os.path.isfile('mystery_files\\'+filename) == False:
            print("File",filename,"does not exist please try again")
        if os.path.isfile('mystery_files\\'+filename) == True:
            #print("Does exist")
            i = 1
            (exit)
    
    return filename
    
    # Do not use any other input or output statements in this function.

    
def read_directory_name(prompt):
    '''Use prompt (a string) to ask the user to type the name of a directory. If
    the directory does not exist, keep asking until they give a valid directory.
    '''
    
    # To do: Complete this function's body to meet its specification.
    # use print ("That directory does not exist: " + dirname)

    i = 0
    while i != 1:
        dirname = input(prompt)
        if os.path.exists(dirname) == False:
            print("File",dirname,"does not exist please try again")
        if os.path.exists(dirname) == True:
            #print("Does exist")
            i = 1
            (exit)

    
    return dirname

    
def compare_signatures(sig1, sig2, weight):
    '''Return a non-negative real number indicating the similarity of two 
    linguistic signatures. The smaller the number the more similar the 
    signatures. Zero indicates identical signatures.
    sig1 and sig2 are 6 element lists with the following elements
    0  : author name (a string)
    1  : average word length (float)
    2  : TTR (float)
    3  : Hapax Legomana Ratio (float)
    4  : average sentence length (float)
    5  : average sentence complexity (float)
    weight is a list of multiplicative weights to apply to each
    linguistic feature. weight[0] is ignored.
    '''
    mys_list = sig1
    sig_list = sig2
    weight_list = weight
    compare_list = []
    
    num1 = (abs((mys_list[1]-sig_list[1])*weight_list[1]))
    num2 = (abs((mys_list[2]-sig_list[2])*weight_list[2]))
    num3 = (abs((mys_list[3]-sig_list[3])*weight_list[3]))
    num4 = (abs((mys_list[4]-sig_list[4])*weight_list[4]))
    num5 = (abs((mys_list[5]-sig_list[5])*weight_list[5]))

    compare_list.append(num1)
    compare_list.append(num2)
    compare_list.append(num3)
    compare_list.append(num4)
    compare_list.append(num5)

    #print(compare_list[4])

    total = sum(compare_list)

    #print(sum(compare_list))
    

    # To do: Replace this function's body to meet its specification.
    return  total

    #print(mys_list[5])
    #print(sig_list[5])
    #print(weight_list[5])
    
    

def read_signature(filename):
    '''Read a linguistic signature from filename and return it as 
    list of features. '''
    
    file = open(filename, 'r')
    # the first feature is a string so it doesn't need casting to float
    result = [file.readline()]
    # all remaining features are real numbers
    for line in file:
        result.append(float(line.strip()))
    return result
        

if __name__ == '__main__':

    prompt = 'enter the name of the file with unknown author:'
    mystery_filename = get_valid_filename(prompt)

    # readlines gives us a list of strings one for each line of the file
    text = open('mystery_files\\'+mystery_filename, 'r').readlines()
    
    # calculate the signature for the mystery file
    mystery_signature = [mystery_filename]
    print('Loading.')
    mystery_signature.append(average_word_length(text))
    print('Loading..')
    mystery_signature.append(type_token_ratio(text))
    print('Loading...')
    mystery_signature.append(hapax_legomana_ratio(text))
    print('Loading....')
    mystery_signature.append(average_sentence_length(text))
    print('Loading.....')
    mystery_signature.append(avg_sentence_complexity(text))
    #print(mystery_signature)
    weights = [0, 11, 33, 50, 0.4, 4]
    #if os.path.isdir(""):
    #    print('mur')
    
    prompt = 'enter the path to the directory of signature files: '
    dir = read_directory_name(prompt)
    # every file in this directory must be a linguistic signature
    files = os.listdir(dir)
    #if os.path.isdir(""):
    print('Loading.')
    
    # we will assume that there is at least one signature in that directory
    this_file = files[0]
    print('Loading..')
    
    signature = read_signature('%s/%s'%(dir,this_file))
    print('Loading...')
    
    best_score = compare_signatures(mystery_signature, signature, weights)
    print('Loading....')
    
    best_author = signature[0]
    for this_file in files[1:]:
        signature = read_signature('%s/%s'%(dir, this_file))
        score = compare_signatures(mystery_signature, signature, weights)
        if score < best_score:
            best_score = score
            best_author = signature[0]
    print ("best author match: %s with score %s"%(best_author, best_score))


