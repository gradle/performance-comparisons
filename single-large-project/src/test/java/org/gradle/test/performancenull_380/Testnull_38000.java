package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_38000 {
    private final Productionnull_38000 production = new Productionnull_38000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}