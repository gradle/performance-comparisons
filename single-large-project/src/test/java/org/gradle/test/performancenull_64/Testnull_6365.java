package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6365 {
    private final Productionnull_6365 production = new Productionnull_6365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}