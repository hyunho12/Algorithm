n,m = map(int,input().split())
cnt = 0
a = []
b = []
ans = []
for _ in range(n):    
    a.append(input())
    
for _ in range(m):
    b.append(input())

ans = sorted(list(set(a) & set(b)))

for i in ans:
    print(i)

print(len(ans))