public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market", //transform
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning", 
            "We need to leverage our core competencies", //leverage
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully", 
            "This blockchain-based solution will disrupt the industry", //disrupt
            "The team showed great synergy in the last project", //synergy
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift", //paradigm
            "Effective presentations must be clear, concise, and humble" 
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }


    // Iterates through all the sentences.
    // If a sentence contains one or more of the keywords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < keywords.length; i++)
        {

            for (int j = 0; j < sentences.length; j++)
            {
                String[] wordsInsentence = wordSplit(sentences[j]);

                for (int k = 0; k < wordsCount(sentences[j]); k++)
                {
                    if (keywords[i].toLowerCase().equals(wordsInsentence[k]))
                    {
                        System.out.print(keywords[i] + ", ");
                    }
                }
            }
        }
    }

    public static int wordsCount(String str)
    {
        int wordscount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                wordscount++;
            }
        }
        return wordscount + 1;
    }

    public static String[] wordSplit(String str)
    {
        String[] words = new String[wordsCount(str)];

        String word = "";
        int j=0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != ' '){
                word = word + str.charAt(i);
            }
            else {
                words[j] = word;
                word = "";
                j++;
            }
        }
        return words;
    }
}
