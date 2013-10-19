/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gagyumolcsszedo;

/**
 *
 * @author Admin
 */
public class GyumolcsTar {
    private String[] nevek;
    private int[] almaDb;
    private int[] korteDb;
    
    private int almaAr;
    private int korteAr;
    
    private int sorokSzama;
    
    
    public GyumolcsTar() {
        sorokSzama = 0;
        nevek = new String[100];
        almaDb = new int[100];
        korteDb = new int[100];
    }
    
    public void ujSor(String nev, int almaDb, int korteDb) {
        nevek[sorokSzama] = nev;
        this.almaDb[sorokSzama] = almaDb;
        this.korteDb[sorokSzama] = korteDb;
        sorokSzama++;
    }
    
    public void setAlmaAr(int ar) {
        almaAr = ar;
    }
    
    public void setKorteAr(int ar) {
        korteAr = ar;
    }
    
    public int getSorokSzama() {
        return sorokSzama;
    }
    
    public int getErtek(int sorszam) {
        return almaDb[sorszam]*almaAr + korteDb[sorszam]*korteAr;
    }
    
    public int getOsszAlmaDb() {
        int ossz = 0;
        for (int i=0; i<sorokSzama; i++) {
            ossz += almaDb[i];
        }
        
        return ossz;
    }

    public int getOsszAlmaErtek() {
        int ossz = 0;
        for (int i=0; i<sorokSzama; i++) {
            ossz += almaDb[i]*almaAr;
        }
        
        return ossz;
    }

    public int getOsszKorteDb() {
        int ossz = 0;
        for (int i=0; i<sorokSzama; i++) {
            ossz += korteDb[i];
        }
        
        return ossz;
    }

    public int getOsszKorteErtek() {
        int ossz = 0;
        for (int i=0; i<sorokSzama; i++) {
            ossz += korteDb[i]*korteAr;
        }
        
        return ossz;
    }

    public int getOsszDb() {
        return this.getOsszAlmaDb() + this.getOsszKorteDb();
    }
    
    public int getOsszErtek() {
        return this.getOsszAlmaErtek() + this.getOsszKorteErtek();
    }
}
