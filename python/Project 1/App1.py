from Line import Line
from Table import Table

# generates all possible lines given a certain size game board
def genPossLines(bound):
    possLines=Table(4,4)
    numPossLines=0
    for x in range(bound):
        for y in range(bound):
            for a in range(bound):
                for b in range(bound):
                    if x in [a-1,a+1]:
                        if y==b:
                            possLines.addRow([x,y,a,b])
                            numPossLines+=1
                    elif y in [b-1,b+1]:
                        if x==a:
                            possLines.addRow([x,y,a,b])
                            numPossLines+=1
    return possLines,numPossLines


# Creates the game board given a size of one dimension
def createTable(x):
    t= Table(x,x)
    t.constructTable()
    print("Table:")
    t.printTable()
    print("reference coordinates: ")
    t.printCoordinates()
    return t


# gets and checks coordinate input for user's turns
def newLine():
    valid = True
    try:
        print ("Enter verticle coordinate for line start, enter q to quit: ")
        x=input()
        if x=='q':
            quit()
        else:
            x=int(x)
        print("Enter horizontal coordinate for line start point: ")
        y=int(input())
        print ("Enter verticle coordinate for line end point: ")
        a=int(input())
        print("Enter horizontal coordinate for line end point: ")
        b=int(input())
        if (x<=0 and x>3) or (y<=0 and y>3) or (a<=0 and a>3) or (b<=0 and b>3):
         line=None
        else:
            line=Line([x,y],[a,b])
    
    except TypeError and ValueError as Exception:
        x=1
        y=1
        a=3
        b=3
        line=Line([x,y],[a,b])
    return line

# changes the symbol for certain spots in the game board
def changeSymbol(Tab,i, x):
    Tab.getList()[i][2]=x

# updates the table to reflect user's input
def updateTable(line,table): 
    for i in range(table.getSize()):
        if line.getStart()[0]==table.getRow(i)[0] and line.getStart()[1]==table.getRow(i)[1]:
            changeSymbol(table,i,'x')
        if line.getEnd()[0]==table.getRow(i)[0] and line.getEnd()[1]==table.getRow(i)[1]:
            changeSymbol(table,i,'x')


# checks if certain lines have been used    
def used(line,lines): ##returning None
    flag=False
    for i in range (len(lines)):
        if line.list()==lines[i]:
            return True
        else: 
            
            return False

# play a single turn of the game
def turn(table,t,possLines,lines,p1,p2):
    squares=[]
    if t%2==0:
        print("Player 1 turn:")
    else:
        print("Player 2 turn:")
    x=newLine() ##Good 
    val=x.validLine()
    if x!=None:
        if val==False:
            print("That is not a valid line, lose your turn!")
        #print (used(x)) ##returning None
        while used(x,lines)==True:
            print("Enter a valid unused line ")
            x=newLine()
            print(x.printLine())
        if x!=None and val:    
            lines.append(x.list())
            updateTable(x,table) ##Good
            print("lines: ",lines)
        #player+=1
        sq=countSquares4by4(possLines,lines)
        squares.append(sq)
        if sq!=0: ##Returning None
            if t%2==0:
                p1+=1
            else:
                p2+=1
        
    else:
         print("That is not a valid line, lose your turn! OOR")
        
    print ("square")
    table.printTable()
    return lines,p1,p2

# gets the specific squares in a 4 by 4 game board. 
# Only works for 4 by 4 game board
def countSquares4by4(lines,entLines):
    square=0
    square1=[[lines.getList()[0],lines.getList()[2]],[lines.getList()[1],lines.getList()[10]],\
              [lines.getList()[11],lines.getList()[14]],[lines.getList()[4],lines.getList()[13]]]
    square2=[[lines.getList()[4],lines.getList()[13]],[lines.getList()[3],lines.getList()[5]],\
              [lines.getList()[18],lines.getList()[15]],[lines.getList()[17],lines.getList()[7]]]
    square3=[[lines.getList()[6],lines.getList()[8]],[lines.getList()[7],lines.getList()[17]],\
              [lines.getList()[22],lines.getList()[19]],[lines.getList()[9],lines.getList()[21]]]
    square4=[[lines.getList()[11],lines.getList()[14]],[lines.getList()[12],lines.getList()[24]],\
              [lines.getList()[16],lines.getList()[27]],[lines.getList()[25],lines.getList()[28]]]
    square5=[[lines.getList()[16],lines.getList()[27]],[lines.getList()[15],lines.getList()[18]],\
              [lines.getList()[29],lines.getList()[32]],[lines.getList()[20],lines.getList()[31]]]
    square6=[[lines.getList()[20],lines.getList()[31]],[lines.getList()[19],lines.getList()[22]],\
              [lines.getList()[33],lines.getList()[36]],[lines.getList()[23],lines.getList()[35]]]
    square7=[[lines.getList()[26],lines.getList()[38]],[lines.getList()[25],lines.getList()[28]],\
              [lines.getList()[39],lines.getList()[41]],[lines.getList()[30],lines.getList()[40]]]
    square8=[[lines.getList()[30],lines.getList()[40]],[lines.getList()[29],lines.getList()[32]],\
              [lines.getList()[42],lines.getList()[44]],[lines.getList()[34],lines.getList()[43]]]
    square9=[[lines.getList()[34],lines.getList()[43]],[lines.getList()[33],lines.getList()[36]],\
              [lines.getList()[45],lines.getList()[47]],[lines.getList()[37],lines.getList()[41]]]
    #squares=[1,2,3,4,5,6,7,8,9]
    if (square1[0][0] or square1[0][1]) in entLines and \
    (square1[1][0] or square1[1][1]) in entLines and \
    (square1[2][0] or square1[2][1]) in entLines and \
    (square1[3][0] or square1[3][1]) in entLines:
         #squares.remove(1)
         square=1
    if (square2[0][0] or square2[0][1]) in entLines and \
    (square1[1][0] or square2[1][1]) in entLines and \
    (square1[2][0] or square2[2][1]) in entLines and \
    (square1[3][0] or square2[3][1]) in entLines:
         #squares.remove(2)
         square=2
    if (square3[0][0] or square3[0][1]) in entLines and \
    (square3[1][0] or square3[1][1]) in entLines and \
    (square3[2][0] or square3[2][1]) in entLines and \
    (square3[3][0] or square3[3][1]) in entLines:
         #squares.remove(3)
         square=3
    if (square4[0][0] or square4[0][1]) in entLines and \
    (square4[1][0] or square4[1][1]) in entLines and \
    (square4[2][0] or square4[2][1]) in entLines and \
    (square4[3][0] or square4[3][1]) in entLines:
         #squares.remove(4)
         square=4
    if (square5[0][0] or square5[0][1]) in entLines and \
    (square5[1][0] or square5[1][1]) in entLines and \
    (square5[2][0] or square5[2][1]) in entLines and \
    (square5[3][0] or square5[3][1]) in entLines:
         #squares.remove(5)
         square=5
    if (square6[0][0] or square6[0][1]) in entLines and \
    (square6[1][0] or square6[1][1]) in entLines and \
    (square6[2][0] or square6[2][1]) in entLines and \
    (square6[3][0] or square6[3][1]) in entLines:
         #squares.remove(6)
         square=6
    if (square7[0][0] or square7[0][1]) in entLines and \
    (square7[1][0] or square7[1][1]) in entLines and \
    (square7[2][0] or square7[2][1]) in entLines and \
    (square7[3][0] or square7[3][1]) in entLines:
         #squares.remove(7)
         square=7
    if (square8[0][0] or square8[0][1]) in entLines and \
    (square8[1][0] or square8[1][1]) in entLines and \
    (square8[2][0] or square8[2][1]) in entLines and \
    (square8[3][0] or square8[3][1]) in entLines:
         #squares.remove(8)
         square=8
    if (square2[0][0] or square9[0][1]) in entLines and \
    (square9[1][0] or square9[1][1]) in entLines and \
    (square9[2][0] or square9[2][1]) in entLines and \
    (square9[3][0] or square9[3][1]) in entLines:
         #squares.remove(9)
         square=9
    
    return square

# driver function
def main():
    player1= 0
    player2= 0
    lines=[]
    print("hello")
    boardSize=4

    possLines,numPossLines=genPossLines(boardSize)
    #print("possLines:\n",possLines)
    #print("numPossLines:\n",numPossLines)
    
    table=createTable(boardSize)
    totSquares=(boardSize-1)*(boardSize-1)
    #print("size:",table.getSize())
    t =0
    end=False
    
    while (end==False):
        print("Turn:",t//2+1)
        lines,player1,player2=turn(table,t,possLines,lines,player1,player2)
        #print("type:",type(lines[0]))
        print("Score: ")
        print("Player 1: "+str(player1))
        print ("Player 2: "+str(player2))
        t+=1
        if player1+player2==totSquares:
            end=True
   

    print("Score: ")
    print("Player 1: "+str(player1))
    print ("Player 2: "+str(player2))

main()


