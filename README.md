# sort-o_dot_gitignore
David Chen, Yat Long Chan, Jaylen Zeng

**SotW:**
* **[Shivers](https://open.spotify.com/track/6bQfNiqyCX7UaQSvVVGo4I?si=468fc2d442674c54) by Ed Sheeran**
* **[The Bard's Song](https://open.spotify.com/track/7xPGvZaG9W7UOrCgEwbONe?si=555898783a42482c) by Blind Guardian**

## Bubble Sort

- The best case would be when the array is already sorted. This is because if the array is already sorted, there will only be n-1 comparisons and no swaps are made. The algo will then terminate after the first pass since no swaps are made.
<p align="center">
  <img src="https://cdn.discordapp.com/attachments/623253110285926443/929784320476971038/unknown.png" />
</p>
- Worst case would be if array was in descending order or the opposite of how you want it to be sorted. The algo will have to compare each element with all the other elements, meaning (n^2-n)/2 comparisons are made.
<p align="center">
  <img src="https://cdn.discordapp.com/attachments/623253110285926443/929812721522843658/unknown.png" />
</p>
Best Case Time Complexity: O(n)

Worst Case Time Complexity: O(n^2)

## Selection Sort

- There is no best or worst case as selection sort will always have to compare each element with all the others, making (n^2-n) / 2 comparisons in total.
<p align="center">
  <img src="https://cdn.discordapp.com/attachments/623253110285926443/929814557810122772/unknown.png" />
</p>
Best Case Time Complexity: O(n^2)

Worst Case Time Complexity: O(n^2)

## Insertion Sort

- Best case would be if the array is already sorted. If the array is already sorted, the algorithm only needs to make n-1 comparisons because all comparisons are done on adjacent elements. The algo will terminate after n-1 passes.
<p align="center">
  <img src="https://cdn.discordapp.com/attachments/623253110285926443/929814930474012773/unknown.png" />
</p>
- Worst case would be when the elements are ordered the exact opposite of how you want it to be sorted. The algo will have to compare each element with all the other elements, meaning (n^2-n)/2 comparisons are made.
<p align="center">
  <img src="https://cdn.discordapp.com/attachments/623253110285926443/929814977823514654/unknown.png" />
</p>
Best Case Time Complexity: O(n)

Worst Case Time Complexity: O(n^2)
