package jiho.spring4.sungjukv6.model;

public class SungJukVO {
    private int sjno;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int tot;
    private double avg;
    private char grd;
    private String regdate;

    public SungJukVO() {
    }

    public SungJukVO(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public SungJukVO(String name, int kor, int eng, int mat, int tot, double avg, char grd) {
        this(name, kor, eng, mat);
        this.tot = tot;
        this.avg = avg;
        this.grd = grd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public int getSjno() {
        return sjno;
    }

    public void setSjno(int sjno) {
        this.sjno = sjno;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %d %d %d %d %.1f %s %s\n";
        return String.format(fmt,
                sjno, name, kor, eng, mat, tot, avg, grd, regdate);
    }
}