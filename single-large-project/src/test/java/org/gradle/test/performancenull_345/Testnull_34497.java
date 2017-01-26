package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34497 {
    private final Productionnull_34497 production = new Productionnull_34497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}