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
					
	var protoObj = {x:5, y:7, z:9};
	var myObj1 = Object.create(protoObj);
	console.log(myObj1.x);
	var myObj2 = Object.create(protoObj);
	myObj2.x = 0;
	console.log(myObj2.x);
	delete myObj1.y;
	console.log(myObj2.y);
	console.log(myObj1.y);
	console.log(protoObj.y);
	delete protoObj.z;
	console.log(myObj2.z);
	console.log(myObj1.z);
	console.log(protoObj.z);
}
	window.onload = globalFunction;