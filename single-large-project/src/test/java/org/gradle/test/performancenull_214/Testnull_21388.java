package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21388 {
    private final Productionnull_21388 production = new Productionnull_21388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}