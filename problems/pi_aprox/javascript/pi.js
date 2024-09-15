var steps = 10000;

let x, y, origDist, pi;

let circle = 0, square = 0;

for (let index = 0; index < (steps * steps); index++) {
    x = (Math.random() * (steps)) / steps;
    y = (Math.random() * (steps)) / steps;
    
    origDist = x * x + y * y;
    
    if (origDist <= 1) {
    circle++;
}

    square++;

    pi = (4 * circle) / square;
}

console.log(`Pi is: ${pi} approx.`)
