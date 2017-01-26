package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36084 {
    private final Productionnull_36084 production = new Productionnull_36084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}