package com.example.mimalabo.Fragment_classes;

import com.example.mimalabo.R;

public class Culture
{

        private String name;
        private int ImageId;
        private String description;
        private String coordinates;



    public Culture(String name, int ImagesId, String description, String coordinates)
        {
            this.description = description;
            this.ImageId = ImagesId;
            this.name = name;
            this.coordinates = coordinates;
        }

        public String getName() {
            return name;
        }

        public int getImageId() {
            return ImageId;
        }

        public String getDescription() {
            return description;
        }

        public String getCoordinates() {
            return coordinates;
         }


        public static final Culture[] culture ={
                new Culture("Fang Tribe", R.drawable.fang,"The Fang people are the largest ethnic group in Equatorial Guinea with the highest concentration " +
                "of these people living in Rio Muni Region. They are indigenous to the country’s mainland. The Fang people may be divided into two major groups namely the Ntumu Fang and the Okak Fang. " +
                "These groups can be easily identified by their settlements with reference to the Mbini River. Those Fang that live North of the Mbini River are the Ntumu Fang whereas those that live " +
                "South of the river are the Okak Fang. Overall, the Fang are made up of 67 diverse clans. Besides Equatorial Guinea, the Fang people are also found in southern Cameroon as well as northern Gabon.",null),
                new Culture("Bubi Tribe",R.drawable.bubinew," They are found on the island of Bioko and are Bantus belonging to the “civilization of the ñame”. Their society is structured in the form" +
                        " of a kingdom that was maintained until the end of the colonial period. Their original religion was monotheist and music, dance and their traditional singing was inspired by religious ceremonies that are still deeply rooted. ",null),
                new Culture("Annobon Tribe",R.drawable.annobon,"Annobón, also called Pagalu, volcanic island in the South Atlantic Ocean near the Equator; it is part of Equatorial Guinea. " +
                        "Located about 350 miles (565 km) southwest of continental Equatorial Guinea, it occupies an area of 7 square miles (17 square km) and rises to an elevation of 2,200 feet (671 metres)." +
                        " Fishing and lumbering activities are centred in San Antonio, the chief settlement. Pop. (2001) 5,004.The inhabitants of Annobón represent only a tiny fraction of the population of Equatorial Guinea." +
                        " They are descended from enslaved Africans brought there by the Portuguese when the island was a dependency of Portugal’s São Tomé colony.",null),
                new Culture("Kombe Tribe",R.drawable.bujeba,"Kombe people are an African ethnic group, members of the Bantu group, who are indigenous to Equatorial Guinea.[1] They are native speakers of the Kombe language.\n" +
                        "At the beginning of the twentieth century some of the women intermarried with the Benga people on the Isle of Corisco.[2] From 1964 to 1969 they[who?] were located in Punta Mbonda (North of Bata). " +
                        "They later settled in Cameroon, south of Bata, and south of Rio Benito. They are sometimes referred to as Ndowe or \"Playeros\" (beach people in Spanish), one of several peoples on the Rio Muni coast.",null),
                new Culture("Ndowe Tribe",R.drawable.ndowe,"The Ndowe people form 3.6 of the population of Equatorial Guinea, They are a minority, formed by numerous ethnic groups: the Kombe," +
                        " the Bujeba, the Bapuka, the Balenke, the Enviko and the Benga. Their social organization is through a hierarchy of families, villages, lineages and clans. ",null),
                new Culture("Bisios Tribe",R.drawable.bisios,"Originally from Cameroon, they are not very numerous and emigrated in the 19th century towards the regions near the coast of the Continental Region," +
                        " down the river Ntem.",null),
                new Culture("Fernandinos and creoles Tribe",R.drawable.creoles,"The middle class of land owners and merchants, who lived a long time in the capital and were mixed descendants of workers " +
                        "that settled throughout the centuries on the plantations of the island of Bioko. ",null),
                new Culture("Pymies Tribe",R.drawable.pymies,"In Equatorial Guinea they are called Beyeles and Bokuigns. They live in small groups and are dedicated to hunting and to the collection of roots and wild berries.",null),
        };

}
