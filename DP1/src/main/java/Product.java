public class Product {

    private String name;
    private String category;
    private int price;
    private String expirationDate;

    public static Builder buildProduct(){
        return new Builder();
    }

    public Product(String name, String category, int price, String expirationDate) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString(){
        return "Product : " + name + " " + category + " "
                + price + " " + expirationDate;
    }

    public static class Builder {

        private String name;
        private String category;
        private int price;
        private String expirationDate;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder withExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Product build() {
            return new Product(name,category,price,expirationDate);
        }
    }
}
