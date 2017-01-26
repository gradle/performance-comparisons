package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41242 {
    private final Productionnull_41242 production = new Productionnull_41242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}