package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21696 {
    private final Productionnull_21696 production = new Productionnull_21696("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}