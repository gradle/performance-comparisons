package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42741 {
    private final Productionnull_42741 production = new Productionnull_42741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}