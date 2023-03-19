"""
Anthony Zaccaria
2/21/2023
HW G-1 main
This is my own original work
"""
from Counter import Counter
def main():
    hi=[[1,2],[1,23]]
    print(hi[1][1])
    c1 = Counter(10,2,5,1)
    c2 = Counter(10,2,5,1)
    print(c1,"is equal to\n",c2,":",str(c1.__eq__(c2)))
    print(c1)
    c1.inc()
    print(c1)
    c1.dec()
    print(c1)
    c1.reset()
    print(c1)
    for i in range(10):
        c1.inc()
    print(c1)
    for i in range(12):
        c1.dec()
    print(c1)
    print(c1,"is equal to\n",c2,":",str(c1.__eq__(c2)))
main()