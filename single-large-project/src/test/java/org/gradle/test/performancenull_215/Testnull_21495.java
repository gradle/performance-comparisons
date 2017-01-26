package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21495 {
    private final Productionnull_21495 production = new Productionnull_21495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}