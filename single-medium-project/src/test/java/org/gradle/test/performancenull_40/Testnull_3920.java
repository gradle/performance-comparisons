package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3920 {
    private final Productionnull_3920 production = new Productionnull_3920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}