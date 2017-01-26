package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25431 {
    private final Productionnull_25431 production = new Productionnull_25431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}