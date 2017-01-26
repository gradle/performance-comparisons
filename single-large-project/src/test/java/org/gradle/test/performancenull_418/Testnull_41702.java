package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41702 {
    private final Productionnull_41702 production = new Productionnull_41702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}