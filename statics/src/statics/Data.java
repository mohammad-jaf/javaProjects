/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statics;

/**
 *
 * @author Jafari
 */
public class Data {
    
    public Data(){}
    public Data(String namad, String bazar, String ghaimatMeyangin, String PE, String PEG, String EPS) {
        this.namad = namad;
        this.bazar = bazar;
        this.ghaimatMeyangin = ghaimatMeyangin;
        this.PE = PE;
        this.PEG = PEG;
        this.EPS = EPS;
    }

    
    public Data(String namad, String bazar, String sahamdaranOmde, String portfoyNamad, String mahsolat, String bonyad, String ghymatBazarTaghribi, String natijeNahayi, String ghaimatMeyangin, String PE, String PEG, String EPS, String NAV) {
        this.namad = namad;
        this.bazar = bazar;
        this.sahamdaranOmde = sahamdaranOmde;
        this.portfoyNamad = portfoyNamad;
        this.mahsolat = mahsolat;
        this.bonyad = bonyad;
        this.ghymatBazarTaghribi = ghymatBazarTaghribi;
        this.natijeNahayi = natijeNahayi;
        this.ghaimatMeyangin = ghaimatMeyangin;
        this.PE = PE;
        this.PEG = PEG;
        this.EPS = EPS;
        this.NAV = NAV;
    }

    public String getNamad() {
        return namad;
    }
    public void setNamad(String namad) {
        this.namad = namad;
    }

    public String getBazar() {
        return bazar;
    }
    public void setBazar(String bazar) {
        this.bazar = bazar;
    }

    public String getSahamdaranOmde() {
        return sahamdaranOmde;
    }
    public void setSahamdaranOmde(String sahamdaranOmde) {
        this.sahamdaranOmde = sahamdaranOmde;
    }

    public String getPortfoyNamad() {
        return portfoyNamad;
    }
    public void setPortfoyNamad(String portfoyNamad) {
        this.portfoyNamad = portfoyNamad;
    }

    public String getMahsolat() {
        return mahsolat;
    }
    public void setMahsolat(String mahsolat) {
        this.mahsolat = mahsolat;
    }

    public String getBonyad() {
        return bonyad;
    }
    public void setBonyad(String bonyad) {
        this.bonyad = bonyad;
    }

    public String getGhymatBazarTaghribi() {
        return ghymatBazarTaghribi;
    }
    public void setGhymatBazarTaghribi(String ghymatBazarTaghribi) {
        this.ghymatBazarTaghribi = ghymatBazarTaghribi;
    }

    public String getNatijeNahayi() {
        return natijeNahayi;
    }
    public void setNatijeNahayi(String natijeNahayi) {
        this.natijeNahayi = natijeNahayi;
    }

    public String getGhaimatMeyangin() {
        return ghaimatMeyangin;
    }
    public void setGhaimatMeyangin(String ghaimatMeyangin) {
        this.ghaimatMeyangin = ghaimatMeyangin;
    }

    public String getPE() {
        return PE;
    }
    public void setPE(String PE) {
        this.PE = PE;
    }

    public String getPEG() {
        return PEG;
    }
    public void setPEG(String PEG) {
        this.PEG = PEG;
    }

    public String getEPS() {
        return EPS;
    }
    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getNAV() {
        return NAV;
    }
    public void setNAV(String NAV) {
        this.NAV = NAV;
    }
   
        
    private String namad,bazar,sahamdaranOmde,portfoyNamad,mahsolat,bonyad,ghymatBazarTaghribi,natijeNahayi,ghaimatMeyangin,PE,PEG,EPS,NAV;
    @Override
    public String toString() {
        return "Data{" + "namad=" + namad + ", bazar=" + bazar + ", ghaimatMeyangin=" + ghaimatMeyangin + ", PE=" + PE + ", PEG=" + PEG + ", EPS=" + EPS + '}';
    }

  
}
