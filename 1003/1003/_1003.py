t = int(input())
arr = []

def arr1(n):
    if n == 0:
        return 1
    elif n == 1:
        return 0
    else:
        return arr1(n-1) + arr1(n-2)
def arr2(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    return arr2(n-1) + arr2(n-2)


for i in range(t):
    arr.append(int(input()))
    arr1(arr[i])
    arr2(arr[i])
    
    print(arr1(arr[i]),arr2(arr[i]))


