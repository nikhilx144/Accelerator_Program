/* Loops + Functions + Switch Trainer — STUDENT */
'use strict';

const $ = s => document.querySelector(s);
let numbers = [];

// 1) Parse and load numbers (function + array methods ok)
function loadNumbers(input) {
  // Parse comma-separated integers into an array of numbers.
  return input.split(',')
    .map(x => x.trim())
    .filter(x => x.length)
    .map(x => Number.parseInt(x, 10))
    .filter(n => Number.isFinite(n));
}

// 2) Run operation using switch
function runOperation(arr, op) {
  // TODO-1: Implement switch(op) and return the result of these operations:
  //  - 'sum'         => sum of all numbers (use a loop)
  //  - 'product'     => product of all numbers (use a loop)
  //  - 'max'         => maximum number (loop or Math.max with loop-prep)
  //  - 'count-even'  => count of even numbers (use a loop and % 2)
  // For unknown ops, return 'Unknown op'.
  // --- your code below ---
  switch (op) {
    case 'sum':
      let sum = 0;
      for (let num of arr) { sum += num; }
      return sum;
    case 'product': 
      let product = 1;
      for (let num of arr) { product = product * num; }
      return arr.length ? product : 0;
    case 'max':
      if (arr.length == 0) return 'N/A';
      let max = Number.MIN_SAFE_INTEGER;
      for (let num of arr) {
        if (num > max) { max = num; }
      }
      return max;
    case 'count-even':
      let even_count = 0;
      for (let num of arr) { if (num % 2 == 0) even_count++; }
      return even_count;
    default:
      return 'Unknown op';
  }
  // --- end ---
}

// 3) Even/Odd summary (loops + function)
function summarizeEvenOdd(arr) {
  // TODO-2: Using a loop, compute how many are even and how many are odd.
  // Return an object like: { even: <number>, odd: <number> }
  // --- your code below ---
  let even_count = 0 , odd_count = 0;
  let summary = { even : 0, odd : 0 };
  for (let num of arr) {
    if (num % 2 == 0) even_count++; else odd_count++;
  }
  summary.even = even_count;
  summary.odd = odd_count;
  return summary;
  // --- end ---
}

// UI wiring
$('#btn-load').addEventListener('click', () => {
  numbers = loadNumbers($('#nums').value);
  $('#loaded').textContent = JSON.stringify(numbers);
});

$('#btn-run').addEventListener('click', () => {
  const op = $('#op').value;
  $('#result').textContent = String(runOperation(numbers, op));
});

$('#btn-summary').addEventListener('click', () => {
  const { even, odd } = summarizeEvenOdd(numbers);
  $('#even-count').textContent = String(even);
  $('#odd-count').textContent = String(odd);
});
