package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41764 {
    private final Productionnull_41764 production = new Productionnull_41764("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}