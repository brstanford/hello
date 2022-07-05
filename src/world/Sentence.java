package world;

public class Sentence {
    private String sentence;

    public Sentence(String sentence)
    {
        this.sentence = sentence;
    }

    public String getSentence()
    {
        return this.sentence;
    }

    @Override
    public boolean equals(Object s)
    {
        boolean isEqual = true;
        if(this.sentence.equals(s))
        {
            return isEqual;
        }
        else
        {
            return !isEqual;
        }

    }
}
