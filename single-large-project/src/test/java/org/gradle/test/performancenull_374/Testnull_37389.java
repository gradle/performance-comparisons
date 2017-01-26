package org.gradle.test.performancenull_374;

import static org.junit.Assert.*;

public class Testnull_37389 {
    private final Productionnull_37389 production = new Productionnull_37389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}