package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37447 {
    private final Productionnull_37447 production = new Productionnull_37447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}