package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5475 {
    private final Productionnull_5475 production = new Productionnull_5475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}