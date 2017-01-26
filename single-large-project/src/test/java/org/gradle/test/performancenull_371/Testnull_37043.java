package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37043 {
    private final Productionnull_37043 production = new Productionnull_37043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}