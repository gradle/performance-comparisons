package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36764 {
    private final Productionnull_36764 production = new Productionnull_36764("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}