package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1798 {
    private final Productionnull_1798 production = new Productionnull_1798("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}