package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5973 {
    private final Productionnull_5973 production = new Productionnull_5973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}