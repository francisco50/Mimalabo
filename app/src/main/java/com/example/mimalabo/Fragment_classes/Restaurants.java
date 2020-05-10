package com.example.mimalabo.Fragment_classes;

import com.example.mimalabo.R;

public class Restaurants
{
    private String names2;
    private int ImagesId2;
    private String description2;


    private Restaurants(String names2, int ImagesId2, String description2)
    {
        this.names2 = names2;
        this.ImagesId2 = ImagesId2;
        this.description2 = description2;
    }

    public static final Restaurants restaurants[]={
            new Restaurants("La Luna", R.drawable.res_laluna,"La Luna Restaurant is an international cuisine restaurant located in one of the most emblematic areas of Equatorial Guinea, in front of Port Malabo.\n" +
                    "La Luna restaurant has a large terrace with tables arranged around the pool with a stunning port of Malabo and views the presidential area."),
            new Restaurants("Magno Suites Restaurants",R.drawable.res_magno,"Luxury and discretion go hand in hand in this Boutique Hotel located in Malabo with stunning views of Pico Basile and easy to the main financial and administrative access points of the city.\n" +
                    "Design by Alberto Mustelier, varied and first class cuisine and service worthy of its category, are some of the values that allow guests to enjoy their stay.\n" +
                    "An atmosphere of luxury and discretion with quality service and Wi-Fi throughout all Hotel will make your stay an unforgettable experience."),
            new Restaurants("Restaurante Babel",R.drawable.res_babel," The Babel Restaurant is a restaurant with international cuisine based on the quality of its raw materials located in the heart of the city of Malabo of Equatorial Guinea, next to the square of Waiso.\n" +
                    "The restaurant features an indoor room and an outdoor area where you will spend pleasant moments.\n" +
                    "Babel offers from Monday to Friday an exceptional menu, ideal for those who do not have much time."),
            new Restaurants("Hotel Ibis Restaurant",R.drawable.res_ibis,"A challenge to find as it has no sign, this stylish restaurant is worth seeking out, particularly for lunch. The fish is excellent: try the bilolá – a local shellfish. Wok-cooked tofu and vegetables" +
                    " are good starters and salads are worthwhile. It's slightly less successful at dinner as not everything on the menu is available and it's quite pricey."),
            new Restaurants("Sofitel Le Golf Restaurant",R.drawable.res_legolf,"Fruits de mer are served in this cozy French-style brasserie - along with exotic tastes from Equatorial Guinea such as fried plantains. " +
                    "A superb seafood restaurant in Sipopo for a hearty breakfast, Sunday brunch, business lunch or à la carte dinner."),
            new Restaurants("Sofitel President's Palace",R.drawable.res_palace,"Same as the Le Golf but this Hotel is located in the President's palace offering you a great view of the mansion. Fruits de mer are served in this cozy French-style brasserie - along with exotic tastes from Equatorial Guinea such as fried plantains. " +
                    "A superb seafood restaurant in Sipopo for a hearty breakfast, Sunday brunch, business lunch or à la carte dinner."),
            new Restaurants("ICEF Restaurante Malabo",R.drawable.res_icef,"Located in 'Centro cultural Frances' has a good atmosphere of that french europen feeling with special dishes like Ratatouile, escalope de poisson pane and other delicious dishes. They serve Breakfast, " +
                    "Lunch and Dinner and also accept reservations,seatings, Table service and also serve alcohol."),
            new Restaurants("Restaurante Imagine Malabo",R.drawable.res_imagine,"The IMAGINE Restaurant is located in the new Malabo 2 construction area, specifically between CANIGE and the United Nations building. It has a large area, of which 600 m2 will be used " +
                    "for the Restaurant with the capacity to accommodate 500 diners. IMAGINE, will be able to organize different events, seminars, weddings, baptisms, communions, company meals ... All this at competitive prices and with the highest quality of catering."),

    };


    public String getNames2()
    {
        return names2;
    }

    public String getDescription2()
    {
        return description2;
    }

    public int getImagesId2()
    {
        return ImagesId2;
    }
}
