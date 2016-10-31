<?

$mysqli = new mysqli("mysql.eecs.ku.edu", "ecoots", "ku16eecs", "ecoots");
$id = $_POST["users"];

/* check connection */
if ($mysqli->connect_errno) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

$users = "SELECT post_id, content FROM Posts WHERE user_id='$id'";

if ($result = $mysqli->query($users)) {

    /* fetch associative array */
    while ($row = $result->fetch_assoc()) {
        printf ("%s (%s)\n", $row["post_id"], $row["content"]);
    }

    /* free result set */
    $result->free();
}


/* close connection */
$mysqli->close();

?>
