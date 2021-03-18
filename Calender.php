<?php

class Calender
{
    public function showday($month, $day)
    {
        $date = "2021-" . $month . "-" . $day;
        $dayOfWeek = date("l", strtotime($date));
        return $dayOfWeek;
    }
}
