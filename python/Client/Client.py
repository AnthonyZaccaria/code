"""
Anthony Zaccaria
2/17/2023
Lab 4 client class
This is my own original work
"""

from Person import Person
from Contract import Contract
class Client():
    __name=None
    __contract=None
    def __init__(self,name,contract):
        self.__name=name
        self.__contract=contract

    def __str__(self):
        
        return "name: "+self.getName()+\
            "\nContract:\n  "+str(self.getContract())

    def getName(self):
        return self.__name

    def getContract(self):
        return self.__contract

    def setName(self,name):
        self.__name=name
    def setContract(self,contract):
        self.__contract=contract
