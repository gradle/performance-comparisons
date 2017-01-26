package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37282 {
    private final Productionnull_37282 production = new Productionnull_37282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}