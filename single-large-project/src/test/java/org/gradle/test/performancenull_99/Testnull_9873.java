package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9873 {
    private final Productionnull_9873 production = new Productionnull_9873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}