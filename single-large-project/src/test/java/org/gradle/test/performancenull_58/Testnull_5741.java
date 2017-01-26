package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5741 {
    private final Productionnull_5741 production = new Productionnull_5741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}