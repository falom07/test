package Patterns.RealisationFabricFactory;

public class EnglishTranslate implements Translator{
    private String hi;
    private String buy;
    private String name;
    @Override
    public String translate() {
        return "hi";
    }
}
