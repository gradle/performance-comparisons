package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34993 {
    private final Productionnull_34993 production = new Productionnull_34993("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}