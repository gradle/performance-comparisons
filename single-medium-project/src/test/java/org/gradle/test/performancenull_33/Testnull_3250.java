package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3250 {
    private final Productionnull_3250 production = new Productionnull_3250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}