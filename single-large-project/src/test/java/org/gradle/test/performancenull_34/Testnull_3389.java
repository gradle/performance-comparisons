package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3389 {
    private final Productionnull_3389 production = new Productionnull_3389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}