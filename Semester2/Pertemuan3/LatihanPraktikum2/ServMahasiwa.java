package LatihanPraktikum2;

public class ServMahasiwa {
    private RepoMahasiswa repoMahasiswa;

    public ServMahasiwa(RepoMahasiswa repoMahasiswa) {
        this.repoMahasiswa = repoMahasiswa;
    }

    public void insertMahasiswa(ModelMahasiswa mahasiswa) {
        repoMahasiswa.insertMahasiswa(mahasiswa);
    }

    public ModelMahasiswa[] getAllMahasiswa() {
        return repoMahasiswa.getAllMahasiswa();
    }
}
