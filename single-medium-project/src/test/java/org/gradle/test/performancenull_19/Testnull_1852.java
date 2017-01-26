package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1852 {
    private final Productionnull_1852 production = new Productionnull_1852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}