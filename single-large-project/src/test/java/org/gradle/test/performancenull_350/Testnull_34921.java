package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34921 {
    private final Productionnull_34921 production = new Productionnull_34921("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}