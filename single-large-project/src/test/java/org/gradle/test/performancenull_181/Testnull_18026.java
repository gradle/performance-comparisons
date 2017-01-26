package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18026 {
    private final Productionnull_18026 production = new Productionnull_18026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}