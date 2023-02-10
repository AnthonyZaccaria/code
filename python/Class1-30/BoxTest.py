from Box import Box
b = Box()
b.setContents("Message")
print(b)

second = Box(2, "fancy")
print(second.getSize())
if (b.equals(second)):
    print("Equal")
else:
    print("Not Equal")
    Box.setSymbol('-')

print(b)
print(second)
# don't do any of this (name mangling)
print(second._Box__contents)
second._Box__contents = "Violation of Encapsulation"
print(second)
second._Box__fixSize()
print(second)