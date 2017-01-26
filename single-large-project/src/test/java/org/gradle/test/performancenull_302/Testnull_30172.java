package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30172 {
    private final Productionnull_30172 production = new Productionnull_30172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}