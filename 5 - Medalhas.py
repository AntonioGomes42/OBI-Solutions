tempo_prova = [int(input()), int(input()),  int(input())]
sortedTempo_prova = sorted(tempo_prova)
for i in sortedTempo_prova:  
  print(tempo_prova.index(i) + 1)
