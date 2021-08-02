package com.choucairtesting.automation.models;

import com.github.javafaker.Faker;
import com.github.javafaker.Options;
import com.github.javafaker.PhoneNumber;

import java.util.Locale;

public class DataInjection {




        private final String sheetName;
        private final Object uploadpicture;
        Faker faker = new Faker(new Locale("en-US"));

        private String TEMA_DE_INTERES;
        private String NAME;
        private String FRISTNAME ;
        private String  EMAIL;
        private String CITY;
        private String BUSINESS;
        private PhoneNumber NUM_MOBILE;
        private Options MESSAGE;
        private String SEGURITY;


        public DataInjection() {

            this. TEMA_DE_INTERES= faker.name().name();
            this.NAME = faker.name().name();
            this.EMAIL = "EMAIL";
            this.CITY = "CIUDAD";
            this. BUSINESS= faker.company().name();
            this. NUM_MOBILE= faker.phoneNumber();
            this. MESSAGE= faker.options();




        }

        public CharSequence getName() {
            return null;
        }

        public CharSequence getLastName() {
            return null;
        }

        public CharSequence getEmail() {
            return null;
        }
    }



}
