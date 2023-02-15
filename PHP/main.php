
<?php
    include "mahasiswa.php";
    
    $temp = new mahasiswa("2108938", "Rafi Arsalan", "Ilkom", "FPMIPA");
    $listMhs = [];
    array_push($listMhs, $temp);

    echo "<h3>Data Mahasiswa Awal</h3><br>";
    for ($i=0; $i < count($listMhs); $i++) { 
        echo $i+1;
        echo '. NIM : '.$listMhs[$i]->getNim().'<br>';
        echo '  Nama : '.$listMhs[$i]->getNama().'<br>';
        echo '  Program Studi : '.$listMhs[$i]->getProdi().'<br>';
        echo '  Fakultas :'.$listMhs[$i]->getFakultas().'<br>';
    }
    echo '<br>';

    //menambahkan data mahasiswa baru
    echo "<h3>Data Mahasiswa Setelah ditambah</h3><br>";
    $temp2 = new mahasiswa("","","","");
    $temp2->setNim("2108839");
    $temp2->setNama("Rayhan");
    $temp2->setProdi("IPSE");
    $temp2->setFakultas("FPOK");
    
    $temp3 = new mahasiswa("","","","");
    $temp3->setNim("2107785");
    $temp3->setNama("Bintang");
    $temp3->setProdi("Bahasa Jerman");
    $temp3->setFakultas("FPIPS");
    array_push($listMhs, $temp2);
    array_push($listMhs, $temp3);

    for ($i=0; $i < count($listMhs); $i++) { 
        echo $i+1;
        echo '. NIM : '.$listMhs[$i]->getNim().'<br>';
        echo '  Nama : '.$listMhs[$i]->getNama().'<br>';
        echo '  Program Studi : '.$listMhs[$i]->getProdi().'<br>';
        echo '  Fakultas :'.$listMhs[$i]->getFakultas().'<br>';
    }
    echo '<br>';

    //mengupdate data mahasiswa
    echo "<h3>Data Mahasiswa Setelah diupdate</h3><br>";
    $temp->setNim("2108938");
    $temp->setNama("Rafi Arsalan");
    $temp->setProdi("Teknik Informatika");
    $temp->setFakultas("FPTK");

    for ($i=0; $i < count($listMhs); $i++) { 
        echo $i+1;
        echo '. NIM : '.$listMhs[$i]->getNim().'<br>';
        echo '  Nama : '.$listMhs[$i]->getNama().'<br>';
        echo '  Program Studi : '.$listMhs[$i]->getProdi().'<br>';
        echo '  Fakultas :'.$listMhs[$i]->getFakultas().'<br>';
    }
    echo '<br>';
    
    echo "<h3>Data Mahasiswa Setelah dihapus</h3><br>";
    array_pop($listMhs);
    for ($i=0; $i < count($listMhs); $i++) { 
        echo $i+1;
        echo '. NIM : '.$listMhs[$i]->getNim().'<br>';
        echo '  Nama : '.$listMhs[$i]->getNama().'<br>';
        echo '  Program Studi : '.$listMhs[$i]->getProdi().'<br>';
        echo '  Fakultas :'.$listMhs[$i]->getFakultas().'<br>';
    }
    ?>
</html>
