package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1772 {
    private final Productionnull_1772 production = new Productionnull_1772("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}