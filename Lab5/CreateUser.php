<?

$mysqli = new mysqli("mysql.eecs.ku.edu", "ecoots", "ku16eecs", "ecoots");
$id = $_POST["id"];

/* check connection */
if ($mysqli->connect_errno) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

$exists = "SELECT user_id FROM Users WHERE user_id = '$id'";
$insert = "INSERT INTO Users (user_id) VALUES ('$id')";

if($id == NULL || $id == ""){
  printf("No User Id entered");
}
else if ($mysqli->query($exists) === TRUE) {
  printf ("That User Id already exists");
}
else{
  if ($mysqli->query($insert) === TRUE) {
    printf("New record created successfully");
  }
  else {
    printf("Error: " . $insert . "<br>" . $mysqli->error);
  }
}

/* close connection */
$mysqli->close();

?>
