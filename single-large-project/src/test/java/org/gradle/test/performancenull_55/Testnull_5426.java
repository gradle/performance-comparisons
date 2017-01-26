package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5426 {
    private final Productionnull_5426 production = new Productionnull_5426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}