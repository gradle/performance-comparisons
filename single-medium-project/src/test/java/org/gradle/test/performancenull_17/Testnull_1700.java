package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1700 {
    private final Productionnull_1700 production = new Productionnull_1700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}