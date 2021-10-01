data = input()

arr = list(data)
cnt = 0
for i in arr:
    if i == ' ':
        cnt += 1

print(cnt+1)
# print(len(input().split()))