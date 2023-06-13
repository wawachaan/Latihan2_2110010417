
package universitas;


public class Mahasiswa {
  private String nama;
  private String npm;
  private String prodi;

    public Mahasiswa(String npm, String nama, String prodi) {
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }
  
    public String setDetail(){
        return npm + nama + prodi;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNpm() {
        return npm;
    }
    
    public void setNpm(String npm) {
        this.npm = npm;
    }
}