package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40242 {
    private final Productionnull_40242 production = new Productionnull_40242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}