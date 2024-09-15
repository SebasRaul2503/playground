import random

steps = 10000

x = 0.0
y = 0.0
origDist = 0.0
pi = 0.0

circle = 0
square = 0

for i in range(steps**2):
    x = random.uniform(-1, 1)
    y = random.uniform(-1, 1)
    
    origDist = x**2 + y**2

    if origDist <= 1:
        circle+=1
    
    square+=1

    pi = 4 * circle / square

print("Pi is: ", pi, " approx.")