package android;

public class Address {
private String streetName;
private int houseNumber;
private String city;
private String country;


public String getStreetName() {
	return streetName;
}


public void setStreetName(String streetName) {
	this.streetName = streetName;
}


public int getHouseNumber() {
	return houseNumber;
}


public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public Address (String streetName,int houseNumber,String city,String country){
	this.streetName=streetName;
	this.houseNumber=houseNumber;
	this.city=city;
	this.country=country;
}

}
