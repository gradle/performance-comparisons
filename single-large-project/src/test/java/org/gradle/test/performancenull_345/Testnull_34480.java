package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34480 {
    private final Productionnull_34480 production = new Productionnull_34480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}