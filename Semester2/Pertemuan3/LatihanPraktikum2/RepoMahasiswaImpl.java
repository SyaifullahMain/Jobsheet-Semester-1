package LatihanPraktikum2;

public class RepoMahasiswaImpl implements RepoMahasiswa{
    private ModelMahasiswa[] mahasiswa = new ModelMahasiswa[5];

    public RepoMahasiswaImpl() {
        this.mahasiswa[0] = new ModelMahasiswa("Budi", "123", 'L', 3.45f);
        this.mahasiswa[1] = new ModelMahasiswa("Andi", "124", 'L', 3.56f);
        this.mahasiswa[2] = new ModelMahasiswa("Caca", "125", 'P', 3.78f);
    }
    @Override
    public void insertMahasiswa(ModelMahasiswa mahasiswa) {
        for (int i = 0; i < this.mahasiswa.length; i++) {
            if (this.mahasiswa[i] == null) {
                this.mahasiswa[i] = new ModelMahasiswa();
                this.mahasiswa[i] = mahasiswa;
                break;
            }
        }
    }

    @Override
    public ModelMahasiswa[] getAllMahasiswa() {
        return this.mahasiswa;
    }
}
