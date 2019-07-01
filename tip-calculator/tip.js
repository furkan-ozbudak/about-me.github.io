function calcTip () {
	let subtotal = parseFloat(document.getElementById("subtotal").value);
	let tipPercent =  parseFloat(document.getElementById("tip").value);
	let tipAmount = subtotal * tipPercent / 100;
	document.getElementById("total").innerHTML = subtotal + tipAmount;
}