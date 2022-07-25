package com.db.products;

public class IProductsImplementation implements IProducts {
    public String[] searchProductCatalogue(String str){
        String[] stringList = {"String 1", "String 2"};
        System.out.println(stringList);
        return stringList;
    }
}
