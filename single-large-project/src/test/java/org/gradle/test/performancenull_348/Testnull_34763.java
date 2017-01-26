package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34763 {
    private final Productionnull_34763 production = new Productionnull_34763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}