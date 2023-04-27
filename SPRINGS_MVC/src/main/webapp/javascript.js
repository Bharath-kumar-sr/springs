/**
 * 
 */
function verifyPassword() {
	var a = document.getElementById("d").value;
	var b = document.getElementById("e").value;
	if (a == b) {
		alert("account created successfully");
		return true;
	} else {
		alert("password donot match")
		return false;
	}
}