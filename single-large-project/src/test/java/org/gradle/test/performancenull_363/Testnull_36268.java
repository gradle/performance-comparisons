package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36268 {
    private final Productionnull_36268 production = new Productionnull_36268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}