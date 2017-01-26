package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34403 {
    private final Productionnull_34403 production = new Productionnull_34403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}