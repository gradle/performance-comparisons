package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25002 {
    private final Productionnull_25002 production = new Productionnull_25002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}