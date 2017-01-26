package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20049 {
    private final Productionnull_20049 production = new Productionnull_20049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}