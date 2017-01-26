package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34964 {
    private final Productionnull_34964 production = new Productionnull_34964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}