<?php
class mahasiswa 
{
    private $nim = "";
    private $nama = "";
    private $prodi = "";
    private $fakultas = "";
    function __construct($n, $na, $p, $f)
    {
        $this->nim = $n;
        $this->nama = $na;
        $this->prodi = $p;
        $this->fakultas = $f;
    }
    function setNim($a)
    {
        $this->nim = $a;
    }
    function setNama($a)
    {
        $this->nama = $a;
    }
    function setProdi($a)
    {
        $this->prodi = $a;
    }
    function setFakultas($a)
    {
        $this->fakultas = $a;
    }

    function getNim()
    {
        return $this->nim;
    }
    function getNama()
    {
        return $this->nama;
    }
    function getProdi()
    {
        return $this->prodi;
    }
    function getFakultas()
    {
        return $this->fakultas;
    }
    function __destruct(){
        
    }
}
?>
