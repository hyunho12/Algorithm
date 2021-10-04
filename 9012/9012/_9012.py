n = int(input())

for _ in range(n):
    b = input()
    arr = list(b)
    sum = 0

    for i in arr:
        if i == '(':
            sum += 1
        elif i == ')':
            sum -= 1
    if sum > 0 or sum <0:
        print("NO")
    else:
        print("YES")

