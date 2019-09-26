package com.jfcarocota.udavinciapi.modules;

public class Udavinci {
    String rector;
    String vision;
    String mision;
    String logo;
    String philosophy;
    String dipes;
    String ree;

    public Udavinci(String rector, String vision, String mision, String logo, String philosophy, String dipes, String ree) {
        this.rector = rector;
        this.vision = vision;
        this.mision = mision;
        this.logo = logo;
        this.philosophy = philosophy;
        this.dipes = dipes;
        this.ree = ree;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPhilosophy() {
        return philosophy;
    }

    public void setPhilosophy(String philosophy) {
        this.philosophy = philosophy;
    }

    public String getDipes() {
        return dipes;
    }

    public void setDipes(String dipes) {
        this.dipes = dipes;
    }

    public String getRee() {
        return ree;
    }

    public void setRee(String ree) {
        this.ree = ree;
    }
}
