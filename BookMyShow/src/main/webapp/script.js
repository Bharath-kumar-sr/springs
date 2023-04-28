/**
 * 
 */
function verifyPassword() {
	var a = document.getElementById("password").value;
	var b = document.getElementById("confirmpassword").value;
	if (a == b) {
		prompt("done");
		return true;
	} else {
		document.getElementById("message").innerHTML = "password donot match";
		return false;
	}
}
function logincheck() {
	var mail = document.getElementById("")
}