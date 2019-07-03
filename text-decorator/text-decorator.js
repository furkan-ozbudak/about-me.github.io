"use strict"

function globalFunction() {
	
	const bigTextButton = document.getElementById("big-text-button");
	bigTextButton.onclick = function() {
							textarea.className = "big-font";
						}
	const bling = document.getElementById("bling");
	bling.onchange = function() {
						console.log("bling change");
						const blinglabel = document.getElementById("blinglabel");
						if(bling.checked) {
							blinglabel.style.fontWeight = "bold";
							textarea.style.color = "green";
							textarea.style.textDecoration = "underline";
							document.body.style.backgroundImage = 
							"url('http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";
						}
						else {
							blinglabel.style.fontWeight = "normal";
							textarea.style.color = "black";
							textarea.style.textDecoration = "initial";
						}
					}
}
	window.onload = globalFunction;