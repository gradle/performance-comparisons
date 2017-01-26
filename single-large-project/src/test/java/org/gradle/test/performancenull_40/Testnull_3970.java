package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3970 {
    private final Productionnull_3970 production = new Productionnull_3970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}