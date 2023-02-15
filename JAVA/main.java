import java.util.Scanner;
import java.util.ArrayList;

class main{
    public static void main(String[] args){

        int keluar = 0, i=0;
        int menu = 0;
        String nim, nama, prodi, fakultas;
        ArrayList<Mahasiswa> listMhs = new ArrayList<>();
        String newline = System.lineSeparator();
        Scanner scan = new Scanner(System.in);
        while (keluar == 0)
        {
            int temu = 0;
            menu = 0;
            System.out.println("Pilih Opsi" + newline);
            System.out.println("1 = Tampilkan Data Mahasiswa");
            System.out.println("2 = Masukkan Data Mahasiswa");
            System.out.println("3 = Hapus Data Mahasiswa");
            System.out.println("4 = Update Data Mahasiswa");
            System.out.println("5 = Keluar");
            menu = scan.nextInt();
            if (menu == 1)
            {
                if (listMhs.size() == 0)
                {
                    System.out.println(newline + "[[  Data Mahasiswa Kosong !!!  ]]" + newline); 
                }
                else
                {
                    System.out.println(newline + "[[ DATA MAHASISWA ]]" + newline);
                    for (i = 0; i < listMhs.size(); i++)
                    {
                        System.out.println(Integer.toString(i+1) + ". NIM : " + listMhs.get(i).getNim());
                        System.out.println("   Nama : " + listMhs.get(i).getNama());
                        System.out.println("   Prodi : " + listMhs.get(i).getProdi());
                        System.out.println("   Fakultas : " + listMhs.get(i).getFakultas());
                    }
                    System.out.println(newline);
                }
            }
            else if (menu == 2)
            {
                System.out.println("Masukkan Nama Mahasiswa : ");
                nama = scan.next();
                System.out.println("Masukkan NIM Mahasiswa : ");
                nim = scan.next();
                System.out.println("Masukkan Program Studi : ");
                prodi = scan.next();
                System.out.println("Masukkan Fakultas : ");
                fakultas = scan.next();

                Mahasiswa temp = new Mahasiswa();
                temp.setNim(nim);
                temp.setNama(nama);
                temp.setProdi(prodi);
                temp.setFakultas(fakultas);

                listMhs.add(temp);
                System.out.println(newline + "[[ Data berhasil ditambahkan ]]" + newline);
            }
            else if (menu == 3)
            {
                temu = 0;
                System.out.println("Masukkan nama yang akan dihapus : ") ;
                nama = scan.next();
                i = 0;
                while (i < listMhs.size() && temu == 0)
                {
                    if (listMhs.get(i).getNama().equals(nama))
                    {
                        temu = 1;
                    }
                    else
                    {
                        i++;
                    }
                }
                if (temu == 1)
                {
                    listMhs.remove(i);
                    System.out.println(newline +  "[[ Data berhasil Dihapus ]]" + newline);
                }
                else
                {
                    System.out.println(newline + "[[ Data Tidak Ditemukan ]]"+ newline);
                }
            }
            else if (menu == 4)
            {
                temu = 0;
                System.out.println("Masukkan Nama Mahasiswa yang akan diupdate : ");
                nama = scan.next();
                i = 0;
                while (i < listMhs.size() && temu == 0)
                {
                    if (listMhs.get(i).getNama().equals(nama))
                    {
                        temu = 1;
                    }
                    else
                    {
                        i++;
                    }
                }
                System.out.println("Masukkan Nama Baru Mahasiswa : ");
                nama = scan.next();
                System.out.println("Masukkan NIM Baru Mahasiswa : ");
                nim = scan.next();
                System.out.println("Masukkan Program Studi Baru : ");
                prodi = scan.next();
                System.out.println("Masukkan Fakultas Baru : ");
                fakultas = scan.next();

                if (temu == 1)
                {
                    listMhs.get(i).setNim(nim);
                    listMhs.get(i).setNama(nama);
                    listMhs.get(i).setProdi(prodi);
                    listMhs.get(i).setFakultas(fakultas);
                    System.out.println(newline +  "[[ Data berhasil Diupdate ]]" + newline);
                }
                else
                {
                    System.out.println(newline + "[[ Data Tidak Ditemukan ]]"+ newline);
                }
            }

            else if (menu == 5)
            {
                keluar = 1;
            }
        }
    }
}