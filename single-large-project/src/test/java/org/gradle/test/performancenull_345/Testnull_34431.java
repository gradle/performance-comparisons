package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34431 {
    private final Productionnull_34431 production = new Productionnull_34431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}