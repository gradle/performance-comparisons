package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25600 {
    private final Productionnull_25600 production = new Productionnull_25600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}