package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42905 {
    private final Productionnull_42905 production = new Productionnull_42905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}