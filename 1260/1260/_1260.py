from collections import deque

n,m,v = map(int,input().split())
arr = [[0] * (n+1) for _ in range(n+1)]
visit1 = [0] * (n+1)
visit2 = [0] * (n+1)

def dfs(v):
    visit1[v] = True
    print(v,end=" ")
    for i in range(1,n+1):
        if visit1[i] == 0 and arr[v][i] == 1:
            dfs(i)

def bfs(v):
    q = deque()
    q.append(v)
    visit2[v] = True
    while q:
        v = q.popleft()
        print(v,end = " ")
        for i in range(1,n+1):
            if visit2[i] == 0 and arr[v][i] == 1:
                q.append(i)
                visit2[i] = 1


for _ in range(m):
    x,y = map(int,input().split()) 
    arr[x][y] = arr[y][x] = 1

dfs(v)
print()
bfs(v)