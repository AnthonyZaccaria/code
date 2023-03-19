from Employee import Employee
from HourlyEmployee import HourlyEmployee

def main():
    emp1=HourlyEmployee("Joe",100,"Manager",10.50)
    print(emp1)
    emp2=HourlyEmployee("Joe",100,"Manager",10.50)
    print(emp2)
    print(emp2.__wage)
    if emp1==emp2:
        print("True")
    else:
        print("False")
main()