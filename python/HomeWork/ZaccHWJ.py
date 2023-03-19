"""
Anthony Zaccaria
3/10/2023
HW J-1 
This is my own original work
"""

from Stack import stack

def main():
    str1='(a+b)*((c+d)*14)' #balenced
    str2='<<a> <b> <apple >><>' #balenced
    str3='(1+1+(2*3)' #not balenced
    str4='<----------<===========<----------------->>{' #not balenced
    print(str1,"is balenced:",ifBalenced(str1))
    print(str2,"is balenced:",ifBalenced(str2))
    print(str3,"is balenced:",ifBalenced(str3))
    print(str4,"is balenced:",ifBalenced(str4))


def ifBalenced(expr):
    s=stack()
    for l in expr:
        if l=='(' or l=='{' or l=='<':
            s.push(l)
        if s.__len__()>0:
            if s.peek()== '(':
                if l==')':
                    s.pop() 
            elif s.peek()=='{':
                if l=='}':
                    s.pop()             
            
            elif s.peek()=='<':
                if l=='>':
                    s.pop() 
    if s.__len__()==0:
        return True
    else:
        return False

main()