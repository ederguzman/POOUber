<?php
require_once('Car.php');

class UberX extends Car{
    public $brand;
    public $model;
    
    public function __construct($license, $driver)
    {
        parent::__construct($license, $driver, $brand, $model);
        $this->brand = $brand;
        $this->model = $model;
    }

}

?>