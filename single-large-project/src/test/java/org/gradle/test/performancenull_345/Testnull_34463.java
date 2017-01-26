package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34463 {
    private final Productionnull_34463 production = new Productionnull_34463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}