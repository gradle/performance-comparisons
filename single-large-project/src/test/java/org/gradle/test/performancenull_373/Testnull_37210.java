package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37210 {
    private final Productionnull_37210 production = new Productionnull_37210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}