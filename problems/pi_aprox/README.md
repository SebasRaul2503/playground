# Monte Carlo Pi Approximation

## Description

The **Monte Carlo method** is a statistical technique that leverages random sampling to estimate mathematical constants and solve problems that may be deterministic in principle. In this project, we use the Monte Carlo method to approximate the value of π (pi).

### How It Works

1. **Simulate Random Points:**
   - Generate random points within a square that bounds a circle with a radius of 1 unit. In a 2x2 square centered at the origin, this means generating points where both the x and y coordinates range from -1 to 1.

2. **Determine Points Inside the Circle:**
   - For each randomly generated point `(x, y)`, calculate its distance from the origin using the formula \( x^2 + y^2 \).
   - If the distance squared \( (x^2 + y^2) \) is less than or equal to 1, the point lies inside the unit circle.

3. **Estimate π:**
   - The ratio of the number of points that fall inside the circle (`circle`) to the total number of points generated (`square`) approximates the area ratio of the circle to the square.
   - Since the area of the circle is π and the area of the square is 4, the ratio \( \frac{\text{circle}}{\text{square}} \) approximates \( \frac{\pi}{4} \).
   - Therefore, multiplying this ratio by 4 gives an approximation of π: \( \pi \approx 4 \times \frac{\text{circle}}{\text{square}} \).

4. **Law of Large Numbers:**
   - As the number of simulated points increases, the approximation of π becomes more accurate due to the law of large numbers.