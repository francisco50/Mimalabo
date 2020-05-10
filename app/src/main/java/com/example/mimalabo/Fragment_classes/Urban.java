package com.example.mimalabo.Fragment_classes;

import com.example.mimalabo.R;

public class Urban
{
    private String name;
    private int ImageId;
    private String description;

public Urban(String name, int ImagesId, String description)
{
    this.name = name;
    this.ImageId = ImagesId;
    this.description = description;
}

    public String getDescription()
    {
        return description;
    }

    public int getImageId()
    {
        return ImageId;
    }

    public String getName()
    {
        return name;
    }


    public static final Urban urbans[]=
            {
                new Urban("Independence Day", R.drawable.independencce,"Equatorial Guinea celebrates its Independence Day on October 12. This public holiday commemorates the country’s " +
                        "freedom from Spanish colonization. This is a special DAY in the hearts of all the citizens, many activities take place on this day and if you find yourself in the capital on this day," +
                        "Visit the cultural places, beaches, museums, and parks to see the true spirit of the nation. All public facilities are closed on this day."),
                    new Urban("President's Day",R.drawable.obiang,"President’s Day is His Excellency Teodoro Obiang Nguema Mbasogo’s birthday, which is celebrated annually on June 5." +
                            " He has been the political leader of Equatorial Guinea since 1979 and is known for ousting his dictator uncle, Francisco Macias Nguema."),
                new Urban("Happy New Year",R.drawable.newyear,"Every year on January 1, Equatorial Guinea celebrates the arrival of the upcoming year along with the rest of the world. " +
                    "A New Year’s Eve Gala and fireworks display is organized by the Ministry of Information, Culture and Tourism as a charity event, and it is broadcast throughout the country."),

                    new Urban("Armed Forces Day",R.drawable.army,"August 3 is Equatorial Guinea’s Armed Forces Day to honor the military. It is treated as a public holiday where members of the armed forces" +
                            " gather together for a feast filled with food and drinks. Exhibitions are also held to showcase key achievements. All the country's law enforcement bodies are present on this day to showcase to the country and President many achievement and new advance machinery. "),
                new Urban("Equatorial Guinea Body Paint Festival",R.drawable.bodypaint,"Imagine a world where we can all wake up inspired to go to work in something we love," +
                        " where our family and friends have the opportunity to explore their talents and be valued for that.\n" +
                        "More than a festival, we are a movement to inspire you to explore your talents and show them with pride, feeling full knowing that you are also inspiring others to explore their talents, " +
                        "and this festival is a symbol that tells the world what we believe, our vision, which will be remarkable when you are willing to support the talent of your friends.\n" +
                        "Thank you for being part of this movement!"),

                new Urban("Malabo International Music Festival Day",R.drawable.music_festival,"Malabo International Music & Film Festival is the prime art and cultural festival in sab Saharan Africa dedicated" +
                        " to Music and films attracting exhibitors and visitors from within and outside the central African region, Rest of Africa, Middle East, Europe, Latin America, USA and Asia." +
                        " The theme for the 50 years independence anniversary Festival is “Securing a better Future for a new independent Africa, role of music and films Festivals”. Malabo International" +
                        " Music and Film Festival officially Welcomes you and promise riveting, award-winning cinema from around the world. Africa has really risen to the occasion this year, with a significant" +
                        " upsurge of quality Music and films. It is evident that most tourists in this era now approach tourism with different expectations. Rather than just going on a sightseeing tour and sitting " +
                        "on the beach all day (World Tourism Organization 1999, 118), they often search intense and energetic experiences like parties or concerts. The next event is from April 8 to 15. "),

                new Urban("Malabo Hip Hop Festival",R.drawable.hiphop,"A 10-day event held every year in December, the celebrations are often hosted by the Institute of Cultural Expression." +
                        " Performers in the hip-hop community from all over Africa attend workshops and events hosted by artists from Europe (particularly Spain and France). Music and dance are two of the great passions of the people of Equatorial Guinea. " +
                        "Along with traditional African rhythms, in recent years Latin American music has become fashionable and is now present in most clubs in Malabo. Hip hop has also won many followers, among other things, " +
                        "thanks to the success of the Malabo International Hip Hop Festival, which in November 2013 held its sixth edition. The event, sponsored by the US Embassy in Equatorial Guinea and organized by the Cultural" +
                        " Centre of Spain in Malabo, the Cultural Institute of French Expression (ICEF) and the Equatorial Guinean Cultural centre, each year brings together the best rappers from Guinea and other parts of the world. " +
                        "Closely related to urban culture, the festival also hosts dance performances and workshops on musical creation, studio postproduction and even break dancing."),
                new Urban("Feliz Navidad",R.drawable.navidad,"Equatorial Guinea is mostly Roman Catholic, so the country celebrates Christmas every December 25. Apart from Christian festivities, traditional celebrations " +
                        "are also held like the dance known as balélé in the Bioko region. In the cities, friends and families celebrate together by eating, drinking and exchanging gifts. Equatorial Guineans also decorate their homes with" +
                        " the usual decorations, including lights and Christmas trees. Children go to the categral to take part in many activities like, bicycle riding, picnics, sight seeing and attending Public events."),
                new Urban("Rumbo Malabo",R.drawable.rumbo,"You and all your companions will enjoy a unique landscape along the coast of Sipopo. There will be time to stand up and take photos and, depending on availability," +
                        " it is possible to meet certain places which will tell us about their daily life on the island. Depending on the time of the route, you can buy fresh fish and other seafood.\n" +
                        " Generally, we organize photographic competitions in which we distribute prizes to the winners.\n")

    };

}
