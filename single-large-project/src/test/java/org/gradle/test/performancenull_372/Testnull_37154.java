package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37154 {
    private final Productionnull_37154 production = new Productionnull_37154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}