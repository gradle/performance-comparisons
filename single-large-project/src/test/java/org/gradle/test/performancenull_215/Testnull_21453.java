package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21453 {
    private final Productionnull_21453 production = new Productionnull_21453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}