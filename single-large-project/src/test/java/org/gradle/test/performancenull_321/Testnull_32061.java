package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32061 {
    private final Productionnull_32061 production = new Productionnull_32061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}