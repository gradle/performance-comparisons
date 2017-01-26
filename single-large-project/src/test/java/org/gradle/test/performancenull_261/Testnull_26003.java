package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26003 {
    private final Productionnull_26003 production = new Productionnull_26003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}