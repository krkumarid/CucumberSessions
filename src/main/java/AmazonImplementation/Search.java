package AmazonImplementation;

public class Search
{
    public String displayProduct(Product proName)
    {
        if (proName.getProductList().contains(proName.getProName()))
        {
            return proName.getProName();
        }
        return null;
    }
}
