# Anthony Zaccaria
# CMSCI 256
# Homework D-1 tester
# 2-7-23
# This is my own original work

import random
from Lamp import Lamp


def display(lamps):
    for i in range(30):
        print(lamps[i],end ="")
        if (i+1)%5 == 0:
            print()


def main():
    lamps=[]
    for i in range(30):
        r=random.randint(0,1)
        if r==1:
            l=Lamp(True)
        else:
            l=Lamp(False)    
        lamps.append(l)
    print("Original lamps:")
    display(lamps)
    for i in range(30):
        if i<10:
            lamps[i].flip()
        elif i<20:
            lamps[i].turnOff()
        else:
            lamps[i].turnOn()
    print("lamps after change:")
    display(lamps)
main()