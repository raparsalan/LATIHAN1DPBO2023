from Mahasiswa import Mahasiswa

keluar = 0
menu = 0
nim = "";nama = "";prodi="";fakultas =""

listMhs = []
while keluar == 0:
    temu = 0
    print("Pilih Opsi")
    print("1 = Tampilkan Data Mahasiswa")
    print("2 = Masukkan Data Mahasiswa")
    print("3 = Hapus Data Mahasiswa")
    print("4 = Update Data Mahasiswa")
    print("5 = Keluar")
    menu = input()
    if int(menu) == 1:
        if len(listMhs) == 0:
            print("\n[[  Data Mahasiswa Kosong !!!  ]]\n")
        else:
            jml = 1
            print("[[ DATA MAHASISWA ]]\n")
            for mahasiswa in listMhs:
                print(str(jml)+". NIM : ", mahasiswa.getNim())
                print("   Nama : " , mahasiswa.getNama())
                print("   Prodi : ", mahasiswa.getProdi())
                print("   Fakultas : ", mahasiswa.getFakultas())
                jml+=1
    elif int(menu) == 2:
        temp = Mahasiswa()
        print("Masukkan Nama Mahasiswa : ")
        nama = input()
        print("Masukkan NIM Mahasiswa : ")
        nim = input()
        print("Masukkan Program Studi : ")
        prodi = input()
        print("Masukkan Fakultas : ")
        fakultas = input()

        temp.setNim(nim)
        temp.setNama(nama)
        temp.setProdi(prodi)
        temp.setFakultas(fakultas)
        
        listMhs.append(temp)
        print("\n[[ Data berhasil ditambahkan ]]\n")
        
    elif int(menu) == 3:
        temu = 0
        print("Masukkan nama yang akan dihapus : ")
        nama = input()
        i = 0
        while i < len(listMhs) and temu == 0:
            if listMhs[i].getNama() == nama:
                temu = 1
            else:
                i+=1
        if temu == 1:
            listMhs.pop(i)
            print("\n[[ Data berhasil Dihapus ]]\n")
        else:
            print("\n[[ Data Tidak Ditemukan ]]\n")
    elif int(menu) == 4:
        temu = 0
        print("\nMasukkan Nama Mahasiswa yang akan diupdate : ")
        nama = input()
        i=0
        while i < len(listMhs) and temu == 0:
            if listMhs[i].getNama() == nama:
                temu = 1
            else:
                i+=1
        print("Masukkan Nama Baru Mahasiswa : ")
        nama = input()
        print("Masukkan NIM Baru Mahasiswa : ")
        nim = input()
        print("Masukkan Program Studi Baru : ")
        prodi = input()
        print("Masukkan Fakultas Baru: ")
        fakultas = input()
        
        if temu == 1:
            listMhs[i].setNim(nim)
            listMhs[i].setNama(nama)
            listMhs[i].setProdi(prodi)
            listMhs[i].setFakultas(fakultas)
            print("\n[[ Data Berhasil Diupdate ]]\n")
        else:
            print("\n[[ Data Tidak Ditemukan ]]\n")
    elif int(menu) == 5:
        keluar = 1
