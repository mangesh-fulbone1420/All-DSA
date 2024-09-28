
def removeDuplicate (x):
    return list(dict.fromkeys(x))
mylist = removeDuplicate(['a','b','c','b','a'])
print(mylist)  # Output: ['a', 'b', 'c']