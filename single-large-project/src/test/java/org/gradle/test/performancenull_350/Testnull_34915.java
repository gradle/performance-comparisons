package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34915 {
    private final Productionnull_34915 production = new Productionnull_34915("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}