package visrec.classifier;

import java.util.Map;

/**
 * Generic classifier interface, that all classifiers should implement
 * 
 * Based on classifiers from Weka and JML
 * 
 * @author Zoran Sevarac <zoran.sevarac@deepnetts.com>
 */
public interface Classifier <I, C> {
        
    void buildClassifier(Map<I, C> data); // how to specify specific classifier options in this feneric builde- ? add List<ClassifierOpetion> ? ClassifierOption<Type> (nmae, value)


    // Classify the instance according to this classifier.
    C classify(I instance);


    // Generate the membership distribution for this instance using this classifier.
    Map<C, Double> classDistribution (I instance);    
}
