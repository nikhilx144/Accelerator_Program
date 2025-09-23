"use strict";

let balance = 1000; // starting balance

// TODO-1: Implement getMenuChoice()
// Show a prompt with options: 1) Check Balance 2) Withdraw 3) Deposit 4) Exit
// Return the user's numeric choice (1..4). Validate and re-prompt if invalid.
function getMenuChoice() {
  // TODO
  let menu_choice = prompt('1) Check Balance\n2) Withdraw\n3) Deposit\n4) Exit');
  menu_choice = Number(menu_choice)
  if (menu_choice == 1 || menu_choice == 2 || menu_choice == 3 || menu_choice == 4) {
    return menu_choice;
  }
  else {
    alert("Invalid input, please select a number between 1 and 4.")
    return getMenuChoice();
  }
}

function checkBalance() {
  alert(`Current balance: ₹${balance.toFixed(2)}`);
}

function deposit() {
  const input = prompt("Enter amount to deposit:");
  if (input === null) return;
  const amount = parseFloat(input);
  if (Number.isNaN(amount) || amount <= 0) {
    alert("Invalid amount. Please enter a positive number.");
    return;
  }
  balance += amount;
  alert(`Deposited ₹${amount.toFixed(2)}. New balance: ₹${balance.toFixed(2)}`);
}

// TODO-2: Implement withdraw()
// Prompt for amount; reject NaN/≤0; reject if amount > balance; deduct & alert.
function withdraw() {
  // TODO
  let withdraw_amount = prompt("Enter the amount you wish to withdraw: ");
  if (withdraw_amount == null) return;
  withdraw_amount = Number(withdraw_amount)
  if (isNaN(withdraw_amount) || withdraw_amount <= 0) {
    alert("Invalid Input");
  } 
  else if (withdraw_amount > balance) {
    alert("Insufficient Funds");
  }
  else {
    balance = balance - withdraw_amount;
    alert(`₹${withdraw_amount.toFixed(2)} deducted from account`);
    checkBalance();
  }
}

function runATM() {
  while (true) {
    const choice = getMenuChoice();
    console.log("User chose:", choice);
    switch (choice) {
      case 1:
        checkBalance();
        break;
      case 2:
        withdraw();
        break;
      case 3:
        deposit();
        break;
      case 4:
        alert("Thank you for using the ATM. Goodbye!");
        return; // exit loop
    }
  }
}

document.getElementById("start").addEventListener("click", runATM);
