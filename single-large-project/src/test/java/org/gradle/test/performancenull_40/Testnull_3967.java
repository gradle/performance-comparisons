package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3967 {
    private final Productionnull_3967 production = new Productionnull_3967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}