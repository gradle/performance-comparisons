package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30130 {
    private final Productionnull_30130 production = new Productionnull_30130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}