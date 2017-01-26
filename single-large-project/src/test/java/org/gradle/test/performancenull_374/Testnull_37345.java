package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37345 {
    private final Productionnull_37345 production = new Productionnull_37345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}