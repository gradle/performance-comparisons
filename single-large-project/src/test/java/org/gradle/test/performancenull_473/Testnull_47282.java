package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47282 {
    private final Productionnull_47282 production = new Productionnull_47282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}