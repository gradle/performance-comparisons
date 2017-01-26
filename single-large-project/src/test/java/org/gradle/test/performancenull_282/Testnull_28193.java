package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28193 {
    private final Productionnull_28193 production = new Productionnull_28193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}