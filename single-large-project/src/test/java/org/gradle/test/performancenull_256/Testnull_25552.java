package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25552 {
    private final Productionnull_25552 production = new Productionnull_25552("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}