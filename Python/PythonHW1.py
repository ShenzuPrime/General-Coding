import copy
def main():
    spam = ['apple', 'bananas', 'tofu', 'cats']
    spam1 = ['car', 1, 'cool' , 2.5]
    function(spam)
    function(spam1)
def function(n):
    phrase = str(n[0])
    for x in range(len(n)-2):
        phrase = phrase[:] +', '+ str(n[x+1])
    phrase = phrase[:] +', and '+ str(n[len(n)-1])
    print phrase
main()
