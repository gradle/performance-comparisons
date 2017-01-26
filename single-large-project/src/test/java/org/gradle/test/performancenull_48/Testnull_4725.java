package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4725 {
    private final Productionnull_4725 production = new Productionnull_4725("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}