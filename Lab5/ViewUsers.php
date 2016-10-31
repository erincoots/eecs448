<?

$mysqli = new mysqli("mysql.eecs.ku.edu", "ecoots", "ku16eecs", "ecoots");

/* check connection */
if ($mysqli->connect_errno) {
    printf("Connect failed: %s\n", $mysqli->connect_error);
    exit();
}

$users = "SELECT user_id FROM Users";

if ($result = $mysqli->query($users)) {

    /* fetch associative array */
    while ($row = $result->fetch_assoc()) {
        printf ("%s (%s)\n", $row["user_id"]);
    }

    /* free result set */
    $result->free();
}


/* close connection */
$mysqli->close();

?>
