package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37368 {
    private final Productionnull_37368 production = new Productionnull_37368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}