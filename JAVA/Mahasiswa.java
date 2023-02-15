class Mahasiswa
{
    private String nim;
    private String nama;
    private String prodi;
    private String fakultas;

    Mahasiswa()
    {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.fakultas = "";
    };
    Mahasiswa(String a, String b, String c, String d)
    {
        this.nim = a;
        this.nama = b;
        this.prodi = c;
        this.fakultas = d;
    }

    void setNim(String a)
    {
        this.nim = a;
    }
    void setNama(String a)
    {
        this.nama = a;
    }
    void setProdi(String a)
    {
        this.prodi = a;
    }
    void setFakultas(String a)
    {
        this.fakultas = a;
    }

    String getNim()
    {
        return this.nim;
    }
    String getNama()
    {
        return this.nama;
    }
    String getProdi()
    {
        return this.prodi;
    }
    String getFakultas()
    {
        return this.fakultas;
    }
    
};
