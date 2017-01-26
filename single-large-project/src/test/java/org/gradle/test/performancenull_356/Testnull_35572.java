package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35572 {
    private final Productionnull_35572 production = new Productionnull_35572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}