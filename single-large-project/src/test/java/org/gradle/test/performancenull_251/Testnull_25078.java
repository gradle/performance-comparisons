package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25078 {
    private final Productionnull_25078 production = new Productionnull_25078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}