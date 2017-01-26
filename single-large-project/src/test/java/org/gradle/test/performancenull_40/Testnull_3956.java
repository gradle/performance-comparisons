package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3956 {
    private final Productionnull_3956 production = new Productionnull_3956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}