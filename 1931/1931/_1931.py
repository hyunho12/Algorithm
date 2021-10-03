n = int(input())
a = input().split()
b = input().split()
res = [0] * n
min = 0
sum = 0
for i in range(n):
    for j in range(n):
        res[i] = int(b[i]) * int(a[j])
    min = min(list(res[i]))    
    sum += min
print(sum)