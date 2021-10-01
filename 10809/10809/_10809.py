word = input()
data = list(word)

arr = [-1] * 26
index = 0
a = 0
for i in range(len(data)):    
    index = ord(data[i]) - 97
    if arr[index] == -1:
        arr[index] = i
    else:
        continue
for i in range(26):
    print(arr[i],end = ' ')