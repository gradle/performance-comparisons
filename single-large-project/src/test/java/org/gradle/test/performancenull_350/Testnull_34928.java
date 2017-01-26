package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34928 {
    private final Productionnull_34928 production = new Productionnull_34928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}