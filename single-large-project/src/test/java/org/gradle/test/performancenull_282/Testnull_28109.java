package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28109 {
    private final Productionnull_28109 production = new Productionnull_28109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}