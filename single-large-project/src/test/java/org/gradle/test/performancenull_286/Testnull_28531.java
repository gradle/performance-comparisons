package org.gradle.test.performancenull_286;

import static org.junit.Assert.*;

public class Testnull_28531 {
    private final Productionnull_28531 production = new Productionnull_28531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}