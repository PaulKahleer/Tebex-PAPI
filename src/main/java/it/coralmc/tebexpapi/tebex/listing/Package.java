package it.coralmc.tebexpapi.tebex.listing;

public class Package {
    private long id;
    private long order;
    private String name;
    private String price;
    private Image image;
    private Sale sale;

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getPrice() { return price; }
    public void setPrice(String value) { this.price = value; }

    public Image getImage() { return image; }
    public void setImage(Image value) { this.image = value; }

    public Sale getSale() { return sale; }
    public void setSale(Sale value) { this.sale = value; }
}