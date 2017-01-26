package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4133 {
    private final Productionnull_4133 production = new Productionnull_4133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}