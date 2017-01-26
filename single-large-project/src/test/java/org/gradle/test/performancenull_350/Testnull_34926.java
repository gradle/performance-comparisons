package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34926 {
    private final Productionnull_34926 production = new Productionnull_34926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}