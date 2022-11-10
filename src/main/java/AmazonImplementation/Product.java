package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product
{
    private String proName;
    private int price;
    
    public Product(String proName, int price)
    {
        this.proName = proName;
        this.price = price;
    }
    
    public String getProName()
    {
        return proName;
    }
    
    public void setProName(String proName)
    {
        this.proName = proName;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public List<String> getProductList()
    {
        List<String> productList = new ArrayList<>();
        productList.add("Apple MacBookPro");
        productList.add("Iphone 12");
        productList.add("Apple MacBookAir");

        return productList;
        
    }
}
