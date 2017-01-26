package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3702 {
    private final Productionnull_3702 production = new Productionnull_3702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}