package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25508 {
    private final Productionnull_25508 production = new Productionnull_25508("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}