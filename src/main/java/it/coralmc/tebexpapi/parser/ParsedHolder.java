package it.coralmc.tebexpapi.parser;

public interface ParsedHolder {
    String getIdentifier();
    String parsePlaceholder(String toParse);
}
