package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3568 {
    private final Productionnull_3568 production = new Productionnull_3568("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}