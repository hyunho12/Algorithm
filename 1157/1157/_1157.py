word = input().upper()
data = list(set(word))
cnt = []

for i in data:
    num = word.count(i)
    cnt.append(num)

if cnt.count(max(cnt)) > 1:
    print('?')
else:
    idx = cnt.index(max(cnt))
    print(data[idx])