package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37190 {
    private final Productionnull_37190 production = new Productionnull_37190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}