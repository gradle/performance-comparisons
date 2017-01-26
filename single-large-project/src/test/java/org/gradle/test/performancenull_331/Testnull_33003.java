package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33003 {
    private final Productionnull_33003 production = new Productionnull_33003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}