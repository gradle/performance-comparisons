package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37492 {
    private final Productionnull_37492 production = new Productionnull_37492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}