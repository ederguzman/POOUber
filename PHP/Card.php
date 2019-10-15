<?php

require_once('Payment.php');

class Card extends Payment{
    public $numberCard;
    public $dateCard;
    public $cvv;

    public function __construct($id)
    {
        parent::__construct($id, $numberCard, $dateCard, $cvv);
        $this->numberCard = $numberCard;
        $this->dateCard = $dateCard;
        $this->cvv = $cvv;
    }
}


?>