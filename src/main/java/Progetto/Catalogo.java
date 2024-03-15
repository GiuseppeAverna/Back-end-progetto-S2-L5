package Progetto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Catalogo {
    public List<Libri> libri;
    public List<Riviste> riviste;

    public static void main(String[] args) {
            List<Libri> libri = new ArrayList<>();
            libri.add(new Libri(5465656578007L, "Il signore degli anelli", 1954, 1170, "J.R.R. Tolkien", "Fantasy"));
            libri.add(new Libri(9788804620830L, "Il nome della rosa", 1980, 553, "Umberto Eco", "Romanzo"));
            libri.add(new Libri(9788806222624L, "La ragazza di Bube", 1960, 285, "Carlo Cassola", "Romanzo"));
            libri.add(new Libri(9788804678007L, "1984", 1949, 328, "George Orwell", "Distopia"));
            libri.add(new Libri(9788804678007L, "Il vecchio e il mare", 1952, 127, "Ernest Hemingway", "Romanzo"));
            libri.add(new Libri(9788804678007L, "La metamorfosi", 1915, 68, "Franz Kafka", "Romanzo"));
            libri.add(new Libri(9788804678007L, "L'isola del tesoro", 1883, 336, "Robert Louis Stevenson", "Avventura"));
            libri.add(new Libri(9788804678007L, "Don Chisciotte della Mancia", 1605, 863, "Miguel de Cervantes", "Romanzo"));
            libri.add(new Libri(9788804678007L, "Cime tempestose", 1847, 398, "Emily Brontë", "Romanzo"));
            libri.add(new Libri(9788804678007L, "Moby Dick", 1851, 654, "Herman Melville", "Romanzo"));



            System.out.println("Libri generati:");
            for (Libri libro : libri) {
                System.out.println(libro);
            }

            List<Riviste> riviste = new ArrayList<>();
            riviste.add(new Riviste(9771726230018L, "National Geographic", 1888, 150, Riviste.Periodicita.MENSILE));
            riviste.add(new Riviste(9772281155000L, "The New Yorker", 1925, 80, Riviste.Periodicita.SETTIMANALE));
            riviste.add(new Riviste(9771122028108L, "Scientific American", 1845, 80, Riviste.Periodicita.MENSILE));
            riviste.add(new Riviste(9771726230018L, "Time", 1923, 60, Riviste.Periodicita.SETTIMANALE));
            riviste.add(new Riviste(9772281155000L, "Vanity Fair", 1913, 100, Riviste.Periodicita.SEMESTRALE));
            riviste.add(new Riviste(9771122028108L, "The Economist", 1843, 90, Riviste.Periodicita.SETTIMANALE));
            riviste.add(new Riviste(9771726230018L, "Forbes", 1917, 70, Riviste.Periodicita.SEMESTRALE));
            riviste.add(new Riviste(9772281155000L, "National Geographic Traveler", 1984, 50, Riviste.Periodicita.MENSILE));
            riviste.add(new Riviste(9771122028108L, "Rolling Stone", 1967, 80, Riviste.Periodicita.MENSILE));
            riviste.add(new Riviste(9771726230018L, "Nature", 1869, 40, Riviste.Periodicita.SETTIMANALE));


            System.out.println("\nRiviste generate:");
            for (Riviste rivista : riviste) {
                System.out.println(rivista);



        }




    }





}