"""
Anthony Zaccaria
1/24/2022
Homework 1
This is my own original work
"""
import math
def display(lst):
    i=1
    for v in lst:
        v=str(v)
        if i==1:
            v+='0'
        if i==15:
            v+='0'
        if not '-' in v and i%7!=0:
            print(" "+v,end=" ")

        elif (i%7!=0):
            print(v, end=" ")

        else:
            if not '-' in v:
                print(" "+v)
            else:
                print(v)
        i+=1

def computeVals(listx):
    listy=[]
    for v in listx:
        val=math.sin(v)+math.sin(v*v)
        val=round(val,2)
        listy.append(val)
    return listy

def main():
    listx = [.5*x for x in range(0,21)]
    listy = computeVals(listx)
    display(listy)

main()