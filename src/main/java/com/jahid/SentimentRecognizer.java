package com.jahid;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentRecognizer {
    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! it's me, Jahid. Back again with another java tutorial";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreSentenceList = coreDocument.sentences();

        for (CoreSentence sentence : coreSentenceList){
            System.out.println(sentence);
        }


    }
}
