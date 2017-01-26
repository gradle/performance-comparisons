package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47268 {
    private final Productionnull_47268 production = new Productionnull_47268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}