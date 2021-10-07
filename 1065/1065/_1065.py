n = int(input())
hansu = 0

if n <= 99:
    hansu = n
else:
    hansu = 99
    for i in range(100,n+1):    
        n = list(map(int,str(i)))
        if n[0] - n[1] == n[1] - n[2]:
            hansu += 1
print(hansu)