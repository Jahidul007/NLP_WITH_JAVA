package com.jahid;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline {
    private static Properties properties;
    private static  String propertiesName = "tokenize, ssplit, pos";
    private static StanfordCoreNLP stanfordCoreNLP;

    private Pipeline() {
    }

    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
        stanfordCoreNLP = new StanfordCoreNLP(properties);
    }

    public static StanfordCoreNLP getPipeline(){
        if (stanfordCoreNLP == null)
            stanfordCoreNLP = new StanfordCoreNLP();

        return stanfordCoreNLP;
    }
}
