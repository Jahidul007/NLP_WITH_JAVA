package com.jahid;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class POSExample {

    StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

    String text = "I am jahidul islam from comilla university";

    CoreDocument coreDocument = new CoreDocument(text);
}
