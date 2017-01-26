package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37363 {
    private final Productionnull_37363 production = new Productionnull_37363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}