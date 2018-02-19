package ooplab9;

public class Address {
    private String homenumber;
    private String province;
    private String postcode;

    public Address(String homenumber, String province, String postcode) {
        this.homenumber = homenumber;
        this.province = province;
        this.postcode = postcode;
    }

    //toString
    @Override
    public String toString() {
        return "Address{" +
                "homenumber='" + homenumber + '\'' +
                ", province='" + province + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    //getter and setter method
    public String getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(String homenumber) {
        this.homenumber = homenumber;
    }

    public String getProvince() {
        return province;
    }

    public void setPrivince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}

