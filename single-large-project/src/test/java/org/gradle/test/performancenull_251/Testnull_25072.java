package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25072 {
    private final Productionnull_25072 production = new Productionnull_25072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}