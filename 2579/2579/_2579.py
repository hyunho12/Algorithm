n = int(input())
arr = [0] * n
dp = [0] * n

for i in range(n):
    arr[i] = int(input())
if n == 1:
    print(arr[0])
elif n == 2:
    print(arr[1]+arr[0])
else:
    dp[0] = arr[0]
    dp[1] = arr[1] + arr[0]
    dp[2] = max(arr[2]+arr[0],arr[1]+arr[2])

    for i in range(3,n):
        dp[i] = max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2])

print(dp[n-1])    