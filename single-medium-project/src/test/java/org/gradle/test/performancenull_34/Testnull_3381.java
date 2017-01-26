package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3381 {
    private final Productionnull_3381 production = new Productionnull_3381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}