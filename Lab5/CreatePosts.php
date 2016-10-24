<?

$mysqli = new mysqli("mysql.eecs.ku.edu", "ecoots", "ku16eecs", "ecoots");
$id = $_POST["id"];
$text = $_POST["text"];

/* check connection */
if ($mysqli->connect_errno) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

$exists = "SELECT user_id FROM Users WHERE user_id = '$id'";
$insert = "INSERT INTO Posts (content,author_id) VALUES ('$text','$id')";

/* check if user entered data */
if($id == NULL || $id == ""){
  printf("No User Id entered");
}
else if($text == NULL || $text == ""){
  printf("No content entered");
}
/* check if user exists */
else if ($mysqli->query($exists) === FALSE) {
  printf ("Entered User Id does not exists");
}
/* enter data */
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
