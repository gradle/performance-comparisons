package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18267 {
    private final Productionnull_18267 production = new Productionnull_18267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}