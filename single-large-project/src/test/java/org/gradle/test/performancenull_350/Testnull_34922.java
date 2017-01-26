package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34922 {
    private final Productionnull_34922 production = new Productionnull_34922("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}