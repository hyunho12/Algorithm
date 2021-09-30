n = int(input())
arr = [0] * n
temp = []
for i in range(n):
    arr[i] = int(input())
    
for i in range(n):
    for j in range(i+1,n):
        if arr[j] < arr[i]:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp

for k in range(n):
    print(arr[k])
