from collections import deque

n,m = map(int,input().split())

arr = [[] for _ in range(n+1)]
visit = [0] * (n+1)
res = 0

def bfs(a):
    q = deque()
    q.append(a)

    while q:
        v = q.popleft()
        if visit[v] == 0:
            visit[v] = 1
            for i in arr[v]:
                q.append(i)

for i in range(m):
    u,v = map(int,input().split())
    arr[u].append(v)
    arr[v].append(u)

for i in range(1,n+1):    
    if visit[i] == 0:
        bfs(i)
        res += 1
print(res)