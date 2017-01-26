package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25548 {
    private final Productionnull_25548 production = new Productionnull_25548("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}