var funcs = [];
for (var i = 0; i < 5; i++) {
	funcs[i] = helper(i);
};
function helper(m) {
	return function() { return m; }
}
console.log(funcs[0]()); // 0
console.log(funcs[1]()); // 1
console.log(funcs[2]()); // 2
console.log(funcs[3]()); // 3
console.log(funcs[4]()); // 4 