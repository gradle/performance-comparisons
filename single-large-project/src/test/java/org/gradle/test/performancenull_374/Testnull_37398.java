package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37398 {
    private final Productionnull_37398 production = new Productionnull_37398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}