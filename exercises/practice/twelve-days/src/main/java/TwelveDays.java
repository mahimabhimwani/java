class TwelveDays {
    private String[] dayCount = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private String[] allphrases = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };
    private String mainPhrasePartOne = "On the ";
    private String mainPhrasePartTwo = " day of Christmas my true love gave to me: ";  
    
    String verse(int verseNumber) {
        StringBuilder p = new StringBuilder();
        
        p.append(mainPhrasePartOne);
        p.append(dayCount[verseNumber - 1]);
        p.append(mainPhrasePartTwo);
        
        for (int i = verseNumber; i > 0; i--) {
            p.append(allphrases[i - 1]);
            if (i != 1) {
                p.append(", ");
            }
            if (i == 2) {
                p.append("and ");
            }
        }
        p.append(".\n");
        return p.toString();
    }
    
    String verses(int startVerse, int endVerse) {
        StringBuilder p = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            p.append(verse(i));
            if (i != endVerse) p.append("\n");
        }
        return p.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}

