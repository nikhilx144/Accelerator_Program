document.querySelectorAll(".product-card").forEach((card) => {
  const productName = card.querySelector("h3").textContent.trim();
  const button = card.querySelector(".add-to-cart-button");
  button.setAttribute("aria-label", `Add ${productName} to card (demo)`);
  console.log(`Updated aria-label: ${button.getAttribute('aria-label')}`);
});
