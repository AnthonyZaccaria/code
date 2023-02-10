# Anthony Zaccaria
# CMSCI 256
# Homework D-1 Lamp Class
# 2-7-23
# This is my own original work
class Lamp:
    __isOn=False

    def __init__(self,*args):
        if len(args)==1:
            self.__isOn=args[0]
        else:
            raise Exception("Invalid Constructor")


    def turnOn(self):
        self.__isOn=True
    
    def turnOff(self):
       self.__isOn=False

    def flip(self):
        self.__isOn=not self.__isOn

    def isOn(self):
        return self.__isOn

    def setLamp(self,isOn):
        self.__isOn=isOn

    def __str__(self) -> str:
        out=""
        if self.__isOn:
            out="   "+"On"
        else:
            out="   "+"Off"
        return out
            
    def __eq__(self,l2):
        return self.__isOn==l2.__isOn