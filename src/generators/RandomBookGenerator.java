package generators;

import entity.Book;

import java.util.Random;

public class RandomBookGenerator {
    private Random random = new Random();

    private static final String[] authors = {
            "Aurora Olden",
            "Corrina Dively",
            "Felicidad Buhler",
            "Nona Breiner",
            "Muriel Philpot",
            "Sharice Mccloy",
            "Toi Hensel",
            "Cleora Campas",
            "Eleanora Surber",
            "Chau Batchelor",
            "Jolie Aune",
            "Lulu An",
            "Zane Crater",
            "Jetta Ness",
            "Mozell Hoagland",
            "Shalon Felty",
            "Sherril Saad",
            "Gianna Gunning",
            "Cecil Thornley",
            "Olympia Kelemen",
            "Rosann Hartmann",
            "Alysia Wallner",
            "Lenita Aguila",
            "Shavon Sealy",
            "Alethea Vossler",
            "Naoma Kropp",
            "Joye Losh",
            "Hien Lablanc",
            "Euna Shearer",
            "Jesus Woods",
            "Christen Hazan",
            "Herman Crespo",
            "Harrison Sheely",
            "Larita Molter",
            "Nicol Shell",
            "Adelaide Box",
            "Mack Gamino",
            "Franchesca Hogans",
            "Heath Throckmorton",
            "Nicolasa Isabel",
            "Giselle Servantes",
            "Vernell Brune",
            "Alesia Ciotti",
            "Dorine Dildy",
            "Misti Ester",
            "Hanh Collingwood",
            "Mathilde Marcantonio",
            "Madalyn Halstead",
            "Raisa Cason",
            "Maple Freitag"
    };

    private static final String[] names = {
            "Creator Of Sorrow",
            "Witch Of The Sea",
            "Officers Of The South",
            "Rats Of The Lost Ones",
            "Defenders And Thieves",
            "Cats And Agents",
            "Planet Of The Void",
            "Destiny Of The Solstice",
            "Battle Of Myself",
            "Dancing In The Ships",
            "Emperor Of Twilight",
            "Tortoise Of Hope",
            "Spies Of The Eternal",
            "Girls Of Dreams",
            "Horses And Criminals",
            "Girls And Descendants",
            "Element Of Greatness",
            "Strife Without Time",
            "Write About The Moon",
            "Symbols Of Technology",
            "Swindler Of Desire",
            "Dog Of Joy",
            "Butchers Of The Stars",
            "Trees Without A Conscience",
            "Robots And Heirs",
            "Wolves And Giants",
            "Culmination Of Time",
            "Nation With Immortality",
            "Life Beneath The West",
            "Hunting The Fires",
            "Officer Of Hell",
            "Pirate Of Insanity",
            "Thieves Without Shame",
            "Aliens Of Perfection",
            "Lords And Blacksmiths",
            "Cats And Strangers",
            "Anger Without Glory",
            "Star With Sins",
            "Mending The Sun",
            "Altering My Leader",
            "Agent Without Desire",
            "Bandit Without Faith",
            "Rebels Of Greatness",
            "Hunters Of The Nation",
            "Wives And Pilots",
            "Vultures And Agents",
            "Surprise Of The Mountain",
            "Doom Of The Forsaken",
            "Breaking The Mines",
            "Separated At The West"
    };

    public Book generate() {
        String author = authors[random.nextInt(authors.length)];
        String name = names[random.nextInt(names.length)];

        return new Book(author, name);
    }
}
