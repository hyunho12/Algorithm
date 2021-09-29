def cal(n):
    if n == 0:
        return 0
    else:
        return n+cal(n-1)

n = int(input())
print(cal(n))
print("git Test")