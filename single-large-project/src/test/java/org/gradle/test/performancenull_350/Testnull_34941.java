package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34941 {
    private final Productionnull_34941 production = new Productionnull_34941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}