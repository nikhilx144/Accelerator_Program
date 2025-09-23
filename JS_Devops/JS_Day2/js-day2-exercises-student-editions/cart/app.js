"use strict";

let items = []; // array of { name, price }

// TODO-1: Implement addItem(name, price) as a FUNCTION EXPRESSION.
// Validate non-empty name and positive numeric price; push {name, price} to items.
const addItem = function (name, price) {
  // TODO
  if (name == null || price < 0 || isNaN(price)) return;
  price = Number(price);
  items.push({name, price});
};

const calcSubtotal = function () {
  return items.reduce((sum, it) => sum + it.price, 0);
};

// TODO-2: Implement applyDiscount(total) as an ARROW FUNCTION.
// If total > 500, apply 10% discount; else return total unchanged.
const applyDiscount = (total) => {
  // TODO
  let discount = 0;
  if (total > 500) {
    discount = 0.1;
    total = total * (1 - discount);
    return total;
  }
  return total;
};

function checkout() {
  if (items.length === 0) {
    alert("No items in cart.");
    return;
  }
  console.table(items);
  const subtotal = calcSubtotal();
  const grandTotal = applyDiscount(subtotal);
  const discountNote = grandTotal < subtotal ? " (10% discount applied)" : "";
  alert(
    `Items: ${items.length}\nSubtotal: ₹${subtotal.toFixed(2)}\nTotal: ₹${grandTotal.toFixed(
      2
    )}${discountNote}`
  );
}

function runCart() {
  items = [];
  while (true) {
    const name = prompt("Enter item name (Cancel to checkout):");
    if (name === null) break;
    const priceInput = prompt("Enter price:");
    if (priceInput === null) continue;
    addItem(name, priceInput);
  }
  checkout();
}

document.getElementById("start").addEventListener("click", runCart);
