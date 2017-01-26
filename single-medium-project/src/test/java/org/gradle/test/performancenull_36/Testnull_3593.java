package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3593 {
    private final Productionnull_3593 production = new Productionnull_3593("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}