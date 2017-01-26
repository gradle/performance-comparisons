package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34919 {
    private final Productionnull_34919 production = new Productionnull_34919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}