package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42966 {
    private final Productionnull_42966 production = new Productionnull_42966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}