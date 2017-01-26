package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42119 {
    private final Productionnull_42119 production = new Productionnull_42119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}