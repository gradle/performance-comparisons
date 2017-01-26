package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30572 {
    private final Productionnull_30572 production = new Productionnull_30572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}