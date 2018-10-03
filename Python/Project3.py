from math import sqrt
def main():
    test = ('car', 'magic', 'joke')
    print test[0]
    print len(test[0])
def mean(n): #Mean method which returns the sum of all numbers divided by how many numbers
    return sum(n)/len(n)
def median(n): #Median method which returns the median and if even amount of numbers in list will return both medians
    if len(n) % 2 != 0:
        return n[len(n)/2]
    else:
        return (n[(len(n)/2)-1], n[(len(n)/2)])
def sdeviation(n): #Standard Deviation method, goes through the list and squares the difference of a number by the mean. the square roots the sum of all the powers divided by the amount of numbers in the list
    sum = 0
    meen = mean(n)
    for i in range(len(n)):
        sum += pow((n[i]-meen),2)
    return sqrt(sum/len(n)-1)
def dups(n):
    a = set(n)
    for x in a:
        if n.count(x) > 1:
            print (x , n.count(x))
main()
