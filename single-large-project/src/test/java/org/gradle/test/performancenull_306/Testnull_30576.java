package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30576 {
    private final Productionnull_30576 production = new Productionnull_30576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}