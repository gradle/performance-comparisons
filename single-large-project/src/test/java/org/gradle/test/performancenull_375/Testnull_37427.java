package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37427 {
    private final Productionnull_37427 production = new Productionnull_37427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}