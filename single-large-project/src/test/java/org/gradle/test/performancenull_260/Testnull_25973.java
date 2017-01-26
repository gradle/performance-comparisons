package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25973 {
    private final Productionnull_25973 production = new Productionnull_25973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}