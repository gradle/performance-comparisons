package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12098 {
    private final Productionnull_12098 production = new Productionnull_12098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}