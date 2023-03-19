class Table: 

    __size=0
    __vert=None
    __horiz=None
    __list=[]
    __sym='*'
    
    def __init__(self, horiz,vert):
        self.__vert=vert
        self.__horiz=horiz
        self.__size=vert*horiz
        self.__list=[]
    
    def addRow(self,x):
        if len(x)!=self.__vert:
            print("That is not a valid table entry!")
        else:
            self.__list.append(x)
            if len(self.__list)>self.__horiz:
                self.__horiz+=1

    def constructTable(self):
        count=0
        for i in range (self.__vert):
            count+=1
            for j in range (self.__horiz):
                self.__list.append([i,j,self.__sym])

    def printTable(self):
        count=0
        
        for i in range (len(self.__list)):
            count+=1
            if count%self.__horiz==0:
                x='\n'
            else:
                x=""
            
            print(self.__list[i][2]," ",end=x)


    def printTable1(self):
        count=0
        for i in range(self.__horiz):
            for j in range(self.__vert):
                count+=1
                if count%self.__horiz==0:
                    x='\n'
                else:
                    x=""
                print(self.__list[i][j]," ",end=x)

    def printCoordinates(self):
        count=0
        for i in range (len(self.__list)):
            count+=1
            if count%self.__horiz==0:
                x='\n'
            else:
                x=""
            
            print ("[",self.__list[i][0],",", self.__list[i][1],"]",end=x)


    def changeSymbol(self, x):
        self.__sym=x

    def clear(self):
        self.size=0
        self.__vert=0
        self.__horiz=0
        self.__list=[]

    def __str__(self):
        toStr=""
        count=0
        for i in range(self.__horiz):
            
            count+=1
            if count%self.__horiz==0:
                x='\n'
            else:
                x=""
            toStr+=(str(self.__list[i])+" "+x)
        return toStr        

    def getList(self):
        return self.__list

    def getSize(self):
        return self.__size
    
    def getRow(self, r):
        return self.__list[r]
    
    def getValue(self,row,col):
        return self.__list[row][col]

    def getLength(self, i):
        return self.__vert[i]
     
    def getWidth(self):
        return self.__horiz
