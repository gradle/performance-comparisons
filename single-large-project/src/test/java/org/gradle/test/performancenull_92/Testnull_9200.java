package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9200 {
    private final Productionnull_9200 production = new Productionnull_9200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}