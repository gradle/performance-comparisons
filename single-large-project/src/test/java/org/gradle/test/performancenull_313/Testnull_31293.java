package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31293 {
    private final Productionnull_31293 production = new Productionnull_31293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}