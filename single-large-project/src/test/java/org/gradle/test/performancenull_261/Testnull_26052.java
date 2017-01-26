package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26052 {
    private final Productionnull_26052 production = new Productionnull_26052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}