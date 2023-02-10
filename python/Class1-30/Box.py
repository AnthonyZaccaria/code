class Box:
    __size = None
    __contents = None
    __sym = "*"

    def __init__(self,*args):
        if len(args) == 0:
            self.__size = 4
            self.__contents = ""
        elif len(args) == 2:
            self.__size = args[0]
            self.__contents = args[1]
            self.__fixSize()
        else:
            raise Exception("Invalid Constructor")

    def getSize(self):
        return self.__size

    def getContents(self):
        return self.__contents

    def setSize(self,size):
        self.__size = size
        self.__fixSize()

    def setContents(self,contents):
        self.__contents = contents
        self.__fixSize()

    def __fixSize(self):
        actual = len(self.__contents) + 4
        self.__size = max(actual, self.__size)

    def __str__(self) -> str:
        theSym = Box.__sym
        out = ""
        for i in range(self.__size):
            out += theSym
        out += "\n"
        out += theSym + " " + self.__contents + " "
        spaces = self.__size - len(self.__contents) - 4
        for i in range(spaces):
            out += " "
        out += theSym + "\n"
        for i in range(self.__size):
            out += theSym
        return out

    def equals(self,b2):
        if self.__contents == b2.__contents:
            return True
        else:
            return False

    def setSymbol(s):
        Box.__sym = s