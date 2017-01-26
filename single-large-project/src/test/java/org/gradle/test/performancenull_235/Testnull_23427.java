package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23427 {
    private final Productionnull_23427 production = new Productionnull_23427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}