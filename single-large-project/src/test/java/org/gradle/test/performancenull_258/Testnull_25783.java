package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25783 {
    private final Productionnull_25783 production = new Productionnull_25783("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}