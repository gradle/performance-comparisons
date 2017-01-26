package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25488 {
    private final Productionnull_25488 production = new Productionnull_25488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}