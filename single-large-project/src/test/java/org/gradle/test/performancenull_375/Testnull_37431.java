package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37431 {
    private final Productionnull_37431 production = new Productionnull_37431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}