<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
</head>
<body>
	<form action="create" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td><label for="id">ID</label></td>
				<td><input type="text" name="id" placeholder="id" id="id"></td>
			</tr>
			<tr>
				<td><label for="fn">Name</label></td>
				<td><input type="text" name="name" placeholder="name" id="name"></td>
			</tr>
			<tr>
				<td><label for="mm">Email</label></td>
				<td><input type="email" name="email" placeholder="email"
					id="mm"></td>
			</tr>
			<tr>
				<td><label for="mn">Mobile No</label></td>
				<td><input type="number" id="mn" name="mno"
					placeholder="number"></td>
			</tr>
			<tr>
				<td><label for="dob">DOB</label></td>
				<td><input type="date" id="dob" name="dob"></td>
			</tr>
			<tr>
				<td><label for="gn">Gender</label></td>
				<td><input type="radio" id="gn" name="gender" value="Male">Male
					<input type="radio" id="gn" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td><label for="co">Country</label></td>
				<td><select name="country" id="co">
						<option>India</option>
						<option>Sri lanka</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="st">State</label></td>
				<td><input type="text" id="st" placeholder="state" name="state"></td>
			</tr>
			<tr>
				<td><label for="ps"></label>Professional Skills</td>
				<td><input type="checkbox" name="skill" id="ps"
					value="Communication">Communication <input type="checkbox"
					name="skill" id="ps" value="ability to work">ability to
					work <input type="checkbox" name="skill" id="ps"
					value="decision making">decision making <input
					type="checkbox" name="skill" id="ps" value="time managment">time
					management <input type="checkbox" name="skill" id="ps"
					value="self motivation">self-motivation <input
					type="checkbox" name="skill" id="ps" value="conflict resolution">Conflict
					resolution <input type="checkbox" name="skill" id="ps"
					value="leadership resolution">leadership <input
					type="checkbox" name="skill" id="ps" value="adaptibility">adaptibility</td>
			</tr>
			<tr>
				<td><label for="ph">Photo</label></td>
				<td><input type="file" name="photo" id="ph"></td>
			</tr>
			<tr>
				<td><button>save</button></td>
			</tr>
		</table>
	</form>
</body>
</html>