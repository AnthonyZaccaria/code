"""
Anthony Zaccaria
2/21/2023
HW G-1 Counter class
This is my own original work
"""
class Counter():
    __count=None
    __step=None
    __origCounter=None
    __origStep=None

    def __init__(self,count,step,origCounter,origStep):
        self.__count=count
        self.__step=step
        self.__origCounter=origCounter
        self.__origStep=origStep
    #Getters and Setters
    def getCount(self):
        return self.__count
    def getStep(self):
        return self.__step
    def getOrigCounter(self):
        return self.__origCounter
    def getOrigStep(self):
        return self.__origStep
    def setCount(self,count):
        self.__count=count
    def setStep(self,step):
        self.__step=step

    #Increment, decrement, and reset methods
    def inc(self):
        self.__count+=self.__step
    def dec(self):
        self.__count-=self.__step
    def reset(self):
        self.setCount(self.__origCounter)
        self.setStep(self.__origStep)

    #String and equals method
    def __str__(self) -> str:
        return "Counter: count = "+str(self.getCount())+", step =  "+str(self.getStep())+",\norigStep = "+str(self.getOrigStep())+", origCounter = "+str(self.getOrigCounter())
    
    def __eq__(self,other):
        return self.getCount()==other.getCount() and self.getStep()==other.getStep() and self.getCount()==other.getCount() and self.getOrigStep()==other.getOrigStep() and self.getOrigCounter()==other.getOrigCounter() 


