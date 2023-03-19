"""
Anthony Zaccaria
2/17/2023
Lab 4 driver
This is my own original work
"""
from Person import Person
from Client import Client
from Contract import Contract

def main():
    con1=Contract(12,"I agree to sleep from the hours 10 pm to 6 am.")
    con2=Contract(30,"I agree to mow the lawn for $1 a day without complaining.")
    print(con1)
    print(con2)
    cl1=Client("Anthony",con2)
    cl2=Client("Bob",con1)
    print(cl1)
    print(cl2)
main()
    