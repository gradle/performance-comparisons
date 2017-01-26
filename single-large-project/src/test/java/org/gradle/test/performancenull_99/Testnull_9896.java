package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9896 {
    private final Productionnull_9896 production = new Productionnull_9896("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}