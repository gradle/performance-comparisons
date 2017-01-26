package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3518 {
    private final Productionnull_3518 production = new Productionnull_3518("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}