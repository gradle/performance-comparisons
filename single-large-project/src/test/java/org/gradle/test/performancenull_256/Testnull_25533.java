package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25533 {
    private final Productionnull_25533 production = new Productionnull_25533("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}