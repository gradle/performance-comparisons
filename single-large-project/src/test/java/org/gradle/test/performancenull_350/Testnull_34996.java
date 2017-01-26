package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34996 {
    private final Productionnull_34996 production = new Productionnull_34996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}