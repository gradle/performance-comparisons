package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20422 {
    private final Productionnull_20422 production = new Productionnull_20422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}