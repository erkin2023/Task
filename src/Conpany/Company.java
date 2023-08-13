package Conpany;

import Conpany.Group;

import java.util.Arrays;

public class Company {
      String companyName;
     String country;
     String yearOfFoundation;
    String founder;
    String [] groups;
    String  person ;


    public Company(String companyName, String country, String yearOfFoundation, String founder, String[] groups ,String person) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
        this.person = person;
    }

    public Company(String spaceX, String usa, int i, String elonMusk, Group[] groups, String fdgfdsg) {
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", yearOfFoundation='" + yearOfFoundation + '\'' +
                ", founder='" + founder + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
