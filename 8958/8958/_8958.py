t = int(input())
data = []

for i in range(t):
    data = input()
    arr = list(data)

    sum = 0
    num = 1
    for i in data:    
        if i == 'O':
            sum += num
            num += 1
        elif i == 'X':
            num = 1
    print(sum)
    

