package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28156 {
    private final Productionnull_28156 production = new Productionnull_28156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}