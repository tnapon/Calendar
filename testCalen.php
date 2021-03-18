<?php
include "Calender.php";

use PHPUnit\Framework\TestCase;

class testCalen extends TestCase
{
    private $calendar;

    public function setUp(): void
    {
        $this->calendar = new Calender();
    }
    public function testDate1()
    {
        $this->assertEquals('Wednesday', $this->calendar->showday(02, 03));
    }
    public function testDate2()
    {
        $this->assertEquals('Friday', $this->calendar->showday(01, 15));
    }
    public function testDate3()
    {
        $this->assertEquals('Tuesday', $this->calendar->showday(04, 20));
    }
}
