a = int(input());
b = int(input());
c = int(input());
h = int(input());
l = int(input());

if ((a<=h and b<=l) or (b<=h and a<=l)) or ((a<=h and c<=l) or (c<=h and a<=l)) or ((b<=h and c<=l) or (c<=h and b<=l)):
    print("S")
else:
    print("N")