<?php

require_once('Payment.php');

class Paypal extends Payment{
    public $email;

    public function __construct($id)
    {
        parent::__construct($id, $email);
        $this->email = $email;
    }

}

?>