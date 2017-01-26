package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30741 {
    private final Productionnull_30741 production = new Productionnull_30741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}