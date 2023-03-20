# Anthony Zaccaria and Lexi Eastman
# CMSCI 256 Project 1 Line  
# 3/19/23
# This is our own original work
class Line: 

    __start=None
    __end=None

    def __init__(self, start, end):
        self.__start=start
        self.__end=end

    def validLine(self): 
        if self.__start[0] in [self.__end[0]-1,self.__end[0]+1]:
            if self.__start[1]==self.__end[1]:
                return True
            else:
                return False
        elif self.__start[1] in [self.__end[1]-1,self.__end[1]+1]:
            if self.__start[0]==self.__end[0]:
                return True
            else:
                return False
        else:
            return False
        
    
    def getStart(self):
        return self.__start
    
    def getEnd(self):
        return self.__end
    
    def printLine(self):
        print(self.__start,self.__end)

    def equals(self,l2):
        if self.__start==l2.__start & self.__end==l2.__end:
            return True
        else:
            return False
    
    def list(self):
        return [self.__start[0],self.__start[1],self.__end[0],self.__end[1]]