package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25522 {
    private final Productionnull_25522 production = new Productionnull_25522("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}