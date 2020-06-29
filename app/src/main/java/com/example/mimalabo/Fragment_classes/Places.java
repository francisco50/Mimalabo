package com.example.mimalabo.Fragment_classes;

import com.example.mimalabo.R;

public class Places
{
    private String names1;
    private int ImagesId1;
    private String description1;
    private String coordinates;


    private Places(String names1, int ImagesId1, String description1, String coordinates)
    {
        this.names1 = names1;
        this.ImagesId1 = ImagesId1;
        this.description1 = description1;
        this.coordinates = coordinates;
    }

    public String getNames1()
    {
        return names1;
    }

    public int getImagesId()
    {
        return ImagesId1;
    }

    public String getDescription1()
    {
        return description1;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public static final Places[] places ={
                                          new Places("Bibloteca National de Guinea Ecuatorial", R.drawable.biblotecamalabo,"The National Library of Equatorial Guinea, with the acronym BnGE, is the highest institution of the State and head " +
            "of the Guinean Library system. The BnGE was attached to the Ministry of Culture, but is currently a private department and as a National Library it is the center responsible for the preservation, " + "conservation and dissemination of the documentary " +
             "heritage of Equatorial Guinea.It is currently a state agency and its employees have been hired as officials located each according to their academic records at the corresponding level. But it is planned for the end of 2009 to define the National Library " +
             "as an independent public institution of an administrative nature with a civil identity, with its own statutes and with financial autonomy that will depend organically on the Ministry of Culture.","3.734893,8.7572579"),
                                          new Places("Museo de arte moderno de Guinea Ecuatorial",R.drawable.museoarte,"The Museum of Modern Art of Equatorial Guinea or Museum of Modern Art of Malabo is a space that offers a collection of traditional and " +
             "contemporary art from all parts of the African country of Equatorial Guinea and the entire African continent itself. As described, it tries to show African cultures through art.The Museum aims to improve the understanding and appreciation of the different peoples" +
             " and cultures of Africa through art. The collection of the Museum of Modern Art of Equatorial Guinea shows works of traditional and contemporary art from all over Africa and features pieces from some of the most prestigious creators in the region. " +
             "The Museum is currently expanding the collection and is working with young artists from across the region. It also aims to provide support and training for a new generation of artists, not only offering a space to exhibit, but also giving them the " +
              "opportunity to work with other institutions around the world.","3.734893,8.7572579"),
                                          new Places("Parque national de Malabo",R.drawable.parque1,"Another amazing sightseeing spot in Equatorial Guinea is the Malabo National Park." +
                    " Lovers of nature will surely enjoy visiting this place. The surroundings are clean and calm. There is also a restaurant and some activity areas. If you want to do cycling and boating in Equatorial Guinea, this park is the place to go." +
                    " The trees and plants provide a refreshing experience. You can also go for short walks or jog around this park. If you are going to visit Equatorial Guinea, be sure to drop by the Malabo National Park to enjoy the beauty African nature.","3.734893,8.7572579"),
                                          new Places("Centro Cultural Frances",R.drawable.culturalfrances,"Built in 1985, the Cultural Institute of French Expression (ICEF) of Malabo, is an important part of the cultural landscape of Equatorial Guinea. It plays" +
             " an important role in spreading the French language in Malabo - Equatorial Guinea. Inside this historical building is a large library for children full with french activities, cartoons and novel kids friendly novels, it also contains a library for adults , a big space for" +
                                                  "show peformances for artiste singing days, this places host a variety of artiste every month, some of which are international and local.","3.734893,8.7572579"),
                                          new Places("Catedral de Santa Isabel",R.drawable.catedral_de_santa_isabel,"On the west side of the Plaza de España, this gracious, apricot-hued building is the most beautiful in the country. The architect, Llairadó Luis Segarra," +
              " had some input from Antonio Gaudí. Construction began in 1887 and it was consecrated in 1916. The style is Gothic Revival and it is flanked by two 40m-high towers and has three naves. It has recently been restored. This church is famous in Equatorial Guinea as the sightseeing" +
              " spot that perfectly represents local architecture and culture. Most photographers regard this place as one of the best places for photography and sightseeing. If you are looking for an authentic Equatorial Guinea experience, the Catedral de Santa Isabel is the best place for you.","3.734893,8.7572579"),
                                         new Places("La Casa Varde",R.drawable.casaverdenew,"La Casa Verde (the Green House) is located in the heart of the city. Dating back to the mid-1800, the building was formerly the Portuguese embassy. " +
             "La Casa Verde is home to a number of businesses, and it recently underwent a major renovation.Admire the charming mid 19th-century architecture of La Casa Verde. The three-story house's bold green color is accented by white, gabled balconies," +
             " shutters, and doors. Once home to the Portuguese Embassy, the building now holds several businesses. Recent renovations have restored its attractive interior and exterior","3.734893,8.7572579"),
                                          new Places("Parque National Monte Allen",R.drawable.monteallen1,"This is a stunning place for the animal and birds lovers. This amazing safari experience would just never let you step out of this place." +
              " The dense and beautiful national park filled and rich with the most stunning and glorious species of wild animals would make you go crazy and excited. You can watch the gracious elephants, gorillas, chimpanzees, crocodiles, huge hippos and each of the giant" +
               " and stunning wild life creatures.","3.734893,8.7572579"),
                                          new Places("Nuevo Estadio de Malabo",R.drawable.estadionew,"The New Stadium of Malabo is a multipurpose court located in Malabo, Equatorial Guinea. This stadium is currently used generally for football matches.\n" +
              "The Equatorial Guinea football team usually serves as a venue in this stadium that was opened in 2007 and has a capacity for 15,250 spectators. It was chosen as one of the 4 venues for the 2012 African Cup of Nations, along with La Libertad Stadium, both located " +
              "in Equatorial Guinea. The New Stadium of Malabo is located in the neighborhood of Atepa, a few kilometers from the city of Malabo. It houses a capacity of 30,000 spectators and is currently the most important stadium in the Republic of Equatorial Guinea, ahead of La " +
              "Libertad (Bata) and La Paz (Malabo).This stadium will be one of the four venues of the Africa Cup of Nations 2015 to be held in Equatorial Guinea.","3.734893,8.7572579"),
                                          new Places("Centro Cultural de España en Malabo",R.drawable.centroespana,"This large cultural centre offers Spanish courses as well as a wide array of free events such as concerts, film, theatre and dance, exhibitions," +
              " a library and children's activities. The pleasant restaurant (mains from CFA7000) serves Spanish food and is open Monday to Saturday. Centro Cultural de Espana en Malabo located in Park of the AVAS Africa, Malabo, Equatorial Guinea. This cultural center is home to many " +
             "interactive activities including workshops, recording, and other artistic expressions. Infrastructures in this center include libraries, cafeteria, offices, and training and rehearsal rooms. This place is a must-visit for lovers of the Equatorial Guinea culture!","3.734893,8.7572579"),
                                          new Places("Parque Nacional de Pico Basile",R.drawable.basile,"On a clear day you might be able to see the volcanic peak of Pico Basile, but clear days are rare. The park has dense rain forest and it's worth climbing the " +
              "mountain for the wonderful views, but take a guide. You are not allowed to reach the top as it is a military area. Animals are shy thanks to hunting. Climb Pico Basile to enjoy sweeping views over the entire island from its highest summit. Accessible by guided tour only," +
              " the peak features a statue of the Virgin carrying baby Jesus on her back, in the style of African tribes.","3.734893,8.7572579")
    };
}
