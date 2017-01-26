package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34475 {
    private final Productionnull_34475 production = new Productionnull_34475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}