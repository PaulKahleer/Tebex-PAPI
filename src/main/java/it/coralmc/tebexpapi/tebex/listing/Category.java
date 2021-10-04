package it.coralmc.tebexpapi.tebex.listing;

public class Category {
    private long id;
    private long order;
    private String name;
    private boolean onlySubcategories;
    private Object[] subcategories;
    private Package[] packages;

    public long getid() { return id; }
    public void setid(long value) { this.id = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public boolean getOnlySubcategories() { return onlySubcategories; }
    public void setOnlySubcategories(boolean value) { this.onlySubcategories = value; }

    public Object[] getSubcategories() { return subcategories; }
    public void setSubcategories(Object[] value) { this.subcategories = value; }

    public Package[] getPackages() { return packages; }
    public void setPackages(Package[] value) { this.packages = value; }
}