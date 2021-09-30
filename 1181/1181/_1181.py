n = int(input())

data = []

for i in range(n):
    data.append(input())

set_data = list(set(data))

sort_data = []

for i in set_data:
    sort_data.append((len(i),i))
res = sorted(sort_data)

for word_len,word in res:
    print(word)