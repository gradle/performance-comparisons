package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31472 {
    private final Productionnull_31472 production = new Productionnull_31472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}