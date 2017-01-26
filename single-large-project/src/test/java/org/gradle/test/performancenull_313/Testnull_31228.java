package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31228 {
    private final Productionnull_31228 production = new Productionnull_31228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}