package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40178 {
    private final Productionnull_40178 production = new Productionnull_40178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}