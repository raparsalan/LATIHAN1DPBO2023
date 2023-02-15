class Mahasiswa: 
    __nim = ""
    __nama  = ""
    __prodi_= ""
    __fakultas = ""

    def __init__(self):
        self.nim = ""
        self.nama = ""
        self.prodi = ""
        self.fakultas = ""

    def setNim(self, a):
        self.nim = a
    def setNama(self, a):
        self.nama = a
    def setProdi(self, a):
        self.prodi = a
    def setFakultas(self, a):
        self.fakultas = a
    
    def getNim(self):
        return self.nim
    def getNama(self):
        return self.nama
    def getProdi(self):
        return self.prodi
    def getFakultas(self):
        return self.fakultas

    
    

