package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18082 {
    private final Productionnull_18082 production = new Productionnull_18082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}