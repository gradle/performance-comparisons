package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33973 {
    private final Productionnull_33973 production = new Productionnull_33973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}