package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25854 {
    private final Productionnull_25854 production = new Productionnull_25854("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}