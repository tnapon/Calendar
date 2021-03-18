<?php
include "Calender.php";


$month = $_POST["Month"];
$day = $_POST["Day"];

$calendar = new Calender();
$result = $calendar->showday($month, $day);
echo "<h1 id='result'>$result</h1> ";
