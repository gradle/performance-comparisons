package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28029 {
    private final Productionnull_28029 production = new Productionnull_28029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}