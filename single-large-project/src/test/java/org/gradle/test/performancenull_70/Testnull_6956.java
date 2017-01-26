package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6956 {
    private final Productionnull_6956 production = new Productionnull_6956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}