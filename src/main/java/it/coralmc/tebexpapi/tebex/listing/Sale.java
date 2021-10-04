package it.coralmc.tebexpapi.tebex.listing;

public class Sale {
    private boolean active;
    private String discount;

    public boolean getActive() { return active; }
    public void setActive(boolean value) { this.active = value; }

    public String getDiscount() { return discount; }
    public void setDiscount(String value) { this.discount = value; }
}