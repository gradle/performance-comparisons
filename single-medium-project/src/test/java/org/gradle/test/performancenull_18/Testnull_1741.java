package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1741 {
    private final Productionnull_1741 production = new Productionnull_1741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}