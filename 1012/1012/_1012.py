from collections import deque

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(a,b):
    cnt = 0
    q = deque()
    q.append((a,b))
    visit[a][b] = 1
    cnt += 1

    while q:
        x,y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            elif arr[nx][ny] == 1 and visit[nx][ny] == 0:
                visit[nx][ny] = 1
                q.append((nx,ny))
    return cnt


t = int(input())

for s in range(t):
    m,n,k = map(int,input().split())
    arr = [[0] * m for _ in range(n)]
    visit = [[0] * m for _ in range(n)]

    for _ in range(k):
        x,y = map(int,input().split())
        arr[y][x] = 1
    
    res = 0
    for i in range(n):
        for j in range(m):
            if visit[i][j] == 0 and arr[i][j] == 1:
                res += bfs(i,j)
    print(res)

