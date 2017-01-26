package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3473 {
    private final Productionnull_3473 production = new Productionnull_3473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}