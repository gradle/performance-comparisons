package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28106 {
    private final Productionnull_28106 production = new Productionnull_28106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}