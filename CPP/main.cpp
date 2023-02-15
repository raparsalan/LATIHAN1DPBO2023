#include "mahasiswa.cpp"
#include <list>
using namespace std;

int main()
{
    int keluar = 0;
    int menu = 0;
    string nim, nama, prodi, fakultas;
    mahasiswa temp;
    list<mahasiswa>
        listMhs;
    while (keluar == 0)
    {
        list<mahasiswa>::iterator i;
        int temu = 0;
        menu = 0;
        cout << "Pilih Opsi" << endl;
        cout << "1 = Tampilkan Data Mahasiswa" << endl;
        cout << "2 = Masukkan Data Mahasiswa" << endl;
        cout << "3 = Hapus Data Mahasiswa" << endl;
        cout << "4 = Update Data Mahasiswa" << endl;
        cout << "5 = Keluar" << endl;
        cin >> menu;
        if (menu == 1)
        {
            if (listMhs.size() == 0)
            {
                cout << endl
                     << "[[  Data Mahasiswa Kosong !!!  ]]" << endl
                     << endl;
            }
            else
            {
                int jml = 1;
                cout << endl
                     << "[[ DATA MAHASISWA ]]" << endl;
                for (i = listMhs.begin(); i != listMhs.end(); i++)
                {
                    cout << jml << ". NIM : " << i->getNim() << endl;
                    cout << "   Nama : " << i->getNama() << endl;
                    cout << "   Prodi : " << i->getProdi() << endl;
                    cout << "   Fakultas : " << i->getFakultas() << endl;
                    jml++;
                }
                cout << endl;
            }
        }
        else if (menu == 2)
        {
            cout << "Masukkan Nama Mahasiswa : ";
            cin >> nama;
            cout << "Masukkan NIM Mahasiswa : ";
            cin >> nim;
            cout << "Masukkan Program Studi : ";
            cin >> prodi;
            cout << "Masukkan Fakultas : ";
            cin >> fakultas;

            temp.setNim(nim);
            temp.setNama(nama);
            temp.setProdi(prodi);
            temp.setFakultas(fakultas);

            listMhs.push_back(temp);
            cout << endl
                 << "[[ Data berhasil ditambahkan ]]" << endl
                 << endl;
        }
        else if (menu == 3)
        {
            temu = 0;
            cout << "Masukkan nama yang akan dihapus : ";
            cin >> nama;

            i = listMhs.begin();
            while (i != listMhs.end() && temu == 0)
            {
                if (i->getNama() == nama)
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
                listMhs.erase(i);
                cout << endl
                     << "[[ Data berhasil Dihapus ]]" << endl;
            }
            else
            {
                cout << endl
                     << "[[ Data Tidak Ditemukan ]]" << endl;
            }
        }
        else if (menu == 4)
        {
            temu = 0;
            cout << "Masukkan Nama Mahasiswa yang akan diupdate : ";
            cin >> nama;
            i = listMhs.begin();
            while (i != listMhs.end() && temu == 0)
            {
                if (i->getNama() == nama)
                {
                    temu = 1;
                }
                else
                {
                    i++;
                }
            }
            cout << "Masukkan Nama Baru Mahasiswa : ";
            cin >> nama;
            cout << "Masukkan NIM Baru Mahasiswa : ";
            cin >> nim;
            cout << "Masukkan Program Studi Baru: ";
            cin >> prodi;
            cout << "Masukkan Fakultas Baru: ";
            cin >> fakultas;
            if (temu == 1)
            {
                i->setNim(nim);
                i->setNama(nama);
                i->setProdi(prodi);
                i->setFakultas(fakultas);
                cout << endl
                     << "[[ Data Berhasil Diupdate ]]" << endl;
            }
            else
            {
                cout << endl
                     << "[[ Data Tidak Ditemukan ]]" << endl;
            }
        }

        else if (menu == 5)
        {
            keluar = 1;
        }
    }

    return 0;
};