package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3572 {
    private final Productionnull_3572 production = new Productionnull_3572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}