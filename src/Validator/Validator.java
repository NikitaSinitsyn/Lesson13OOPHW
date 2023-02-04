package Validator;

public class Validator {
    public static String validateString (String parameter, String defaultParameter){
        return (parameter == null ||parameter.isBlank() || parameter.isEmpty()) ? defaultParameter : parameter;
    }

    public static boolean stringNotNullOrEmpty(String parameter) {
        boolean isStringParameterValid = parameter != null && !parameter.isEmpty() && !parameter.trim().isEmpty();
        return isStringParameterValid;
    }

    public static Boolean validateBoolean( Boolean parameter){
        return parameter != null && parameter;
    }

}
