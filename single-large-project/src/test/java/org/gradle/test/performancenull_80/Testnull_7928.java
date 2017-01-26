package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7928 {
    private final Productionnull_7928 production = new Productionnull_7928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}