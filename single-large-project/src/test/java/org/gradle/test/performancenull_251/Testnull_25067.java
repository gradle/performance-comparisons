package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25067 {
    private final Productionnull_25067 production = new Productionnull_25067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}