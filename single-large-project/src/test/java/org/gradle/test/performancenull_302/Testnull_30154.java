package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30154 {
    private final Productionnull_30154 production = new Productionnull_30154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}