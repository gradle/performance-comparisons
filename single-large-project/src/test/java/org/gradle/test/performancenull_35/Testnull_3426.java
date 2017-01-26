package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3426 {
    private final Productionnull_3426 production = new Productionnull_3426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}