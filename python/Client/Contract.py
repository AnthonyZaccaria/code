"""
Anthony Zaccaria
2/17/2023
Lab 4 Contract class
This is my own original work
"""

class Contract():
    __num=None
    __lang=None
    def __init__(self,num,lang):
        self.__num=num
        self.__lang=lang

    def __str__(self):
        return "Contract number: "+str(self.getNum())+\
            "\n Contract detail: "+self.getLang()

    def getNum(self):
        return self.__num

    def getLang(self):
        return self.__lang

    def setNum(self,num):
        self.__num=num
    def setNum(self,lang):
        self.__lang=lang