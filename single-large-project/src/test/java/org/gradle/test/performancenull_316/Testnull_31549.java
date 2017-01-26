package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31549 {
    private final Productionnull_31549 production = new Productionnull_31549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}