<?php

require_once('Payment.php');

class Cash extends Paymen{

    public function __construct($id)
    {
        parent::__construct($id);
    }
}

?>