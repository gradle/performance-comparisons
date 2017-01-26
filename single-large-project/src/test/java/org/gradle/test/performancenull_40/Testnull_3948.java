package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3948 {
    private final Productionnull_3948 production = new Productionnull_3948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}