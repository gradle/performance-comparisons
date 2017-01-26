package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40218 {
    private final Productionnull_40218 production = new Productionnull_40218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}