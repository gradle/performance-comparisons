package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3863 {
    private final Productionnull_3863 production = new Productionnull_3863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}