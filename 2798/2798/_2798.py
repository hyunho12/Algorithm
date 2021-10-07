n,m = map(int,input().split())
nums = []
sum = 0
nums = list(map(int,input().split()))
card = sorted(nums)

for i in range(n-2):
    for j in range(i+1,n-1):
        for k in range(j+1,n):
            if card[i] + card[j] + card[k] > m:
                continue
            else:
                sum = max(sum,card[i] + card[j] + card[k])
print(sum)