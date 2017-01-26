package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25620 {
    private final Productionnull_25620 production = new Productionnull_25620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}