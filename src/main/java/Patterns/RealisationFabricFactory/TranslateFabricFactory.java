package Patterns.RealisationFabricFactory;

public final class TranslateFabricFactory {
    public static Translator getText(Language language) {
        Translator translator = createTranslator(language);
        System.out.println(translator.translate());
        return translator;
    }

    private static Translator createTranslator(Language language) {
        return switch (language) {
            case ENG -> new EnglishTranslate();
            case UA -> new UkraineTranslate();
        };

    }
}
