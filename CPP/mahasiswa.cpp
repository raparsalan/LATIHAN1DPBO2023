#include <iostream>
#include <string>

using namespace std;

class mahasiswa
{
private:
    string nim;
    string nama;
    string prodi;
    string fakultas;

public:
    mahasiswa()
    {
        nim = "";
        nama = "";
        prodi = "";
        fakultas = "";
    };
    mahasiswa(string a, string b, string c, string d)
    {
        nim = a;
        nama = b;
        prodi = c;
        fakultas = d;
    }

    void setNim(string a)
    {
        nim = a;
    }
    void setNama(string a)
    {
        nama = a;
    }
    void setProdi(string a)
    {
        prodi = a;
    }
    void setFakultas(string a)
    {
        fakultas = a;
    }

    string getNim()
    {
        return nim;
    }
    string getNama()
    {
        return nama;
    }
    string getProdi()
    {
        return prodi;
    }
    string getFakultas()
    {
        return fakultas;
    }
    ~mahasiswa()
    {
    }
};
