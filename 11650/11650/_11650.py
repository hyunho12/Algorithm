n = int(input())

dots = []

for i in range(n):
    [x,y] = map(int,input().split())
    dots.append([x,y])

sdots = sorted(dots)
for j in range(n):
    print(sdots[j][0],sdots[j][1])