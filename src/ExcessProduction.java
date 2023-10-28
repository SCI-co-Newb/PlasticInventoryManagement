public class ExcessProduction {
    private double plasticProdInIb;
    private double[] plasticConsInIb;
    private int categories;
    
    public ExcessProduction(double plasticProdInIb, double[] plasticConsInIb) {
        this.plasticProdInIb = plasticProdInIb;
        this.plasticConsInIb = plasticConsInIb;
        this.categories = plasticConsInIb.length;
    }


    public double getPlasticProdInIb() {
        return this.plasticProdInIb;
    }

    public void setPlasticProdInIb(double plasticProdInIb) {
        this.plasticProdInIb = plasticProdInIb;
    }

    public int getCategories() {
        return this.categories;
    }

    public double[] getPlasticConsInIb() {
        return this.plasticConsInIb;
    }

    public void setPlasticConsInIb(double[] plasticConsInIb) {
        this.plasticConsInIb = plasticConsInIb;
        this.categories = plasticConsInIb.length;
    }
    
    public double getExcessProduction() {
        double excessProd = this.plasticProdInIb;
        for (double aPlasticConsInIb : plasticConsInIb) {
            excessProd -= aPlasticConsInIb;
        }
        return excessProd;
    }
}
